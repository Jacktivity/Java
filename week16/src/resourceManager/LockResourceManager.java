package resourceManager;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class LockResourceManager extends BasicResourceManager
{
	//new lock
	final Lock lock = new ReentrantLock();

	//create our array of conditions for each priority
	final Condition[] conditions = new Condition[11]; //lock.newCondition();


	boolean inUse = false;
	
	public LockResourceManager(Resource resource, int maxUses) 
	{
		
		super(resource, maxUses);
		//initialise our conditions array
		for(int i = 0; i < conditions.length; i++)
		{
			conditions[i] = lock.newCondition();
		}
		
	}
	public void requestResource(int priority) throws ResourceError
	{
		lock.lock();
		try 
		{
			//if our resource is inuse
			if(inUse)
			{
				//add to the number waiting
				increaseNumberWaiting(priority);
				//wait until resource is free
				conditions[priority].await();
			}
			// resource is in use 
			inUse = true;
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		finally
		{
			lock.unlock();
		}
		
	}
	public int releaseResource() throws ResourceError 
	{
		lock.lock();
		try 
		{	
			for(int i = 10; i >= 0; i--)
			{	
				//if anything is waiting
				if(getNumberWaiting(i) > 0)
				{
					//decrease the number waiting 
					decreaseNumberWaiting(i);
					//signal to tell user it can stop waiting
					conditions[i].signal();
					//resource is no longer in use
					inUse = false;
					//return our user
					return i;
				}
			}
			//not in use
			inUse = false;
			//no one is waiting
			return NONE_WAITING;
		}
		finally
		{
			lock.unlock();
		}
	}
}
