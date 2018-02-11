package intArrays;
import java.util.Arrays;
import java.util.Random;

import search.IndexingError;

public class CleverRandomListing extends RandomListing
{

	public CleverRandomListing(int size)
	{
		super(size);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void randomise() 
	{	
		int[] copy = new int[getArray().length];
		int j = 0;
		for(int i : copy)
		{
			int randomPos = getRandomIndex();
			copy[j] = randomPos;
			j++;
			//System.out.print(Arrays.toString(copy));
			//System.out.print(randomPos);
		}	
	}
	public static void main(String[] args) 
	{
	    //create new class, set the amount of numbers being randomised
	    RandomListing count = new CleverRandomListing(5);
	   
	    //print in debug log for testing purposes, not advised
	    //System.out.println(Arrays.toString(count.getArray()));
	}
}
