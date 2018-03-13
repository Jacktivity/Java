package intArrays;

import java.util.Arrays; // in order to be able to use the fill(...) method
/**
 * An extension of RandomCount
 * 
 * @author Hugh Osborne
 * @version September 2017
**/
public class SimpleRandomListing extends RandomListing
{
    /**
     * Constructor
     */
    public SimpleRandomListing(int size) 
    {
        super(size);
        
    }
    
    /**
     * Randomise the array
     */
    protected void randomise() 
    {
    	setUp();
    	//create an int array and set it to equal the same size of the array
        int[] copy = new int[getArray().length];
        // used to indicate if elements have been used
        boolean[] used = new boolean[getArray().length];
        //sets all the numbers to equal false
        Arrays.fill(used,false);
       //initialise index, run whilst index is less than array length, add to index each time the code is ran
		for (int index = 0; index < getArray().length; index++) 
		{
			//create new local int randomIndex
        	int randomIndex;
			do 
			{
				//set the new int to be the same as what is returned from getRandomIndex
                randomIndex = getRandomIndex();
            } 
			//set the int that we have randomised to be used
			while (used[randomIndex]);
            copy[index] = getArray()[randomIndex];
            used[randomIndex] = true;
        }
        for (int index = 0; index < getArray().length; index ++) 
        {
        	//set the array to equal the new randomised copy
            getArray()[index] = copy[index];
        }
      tearDown();
    }
    
    public static void main(String[] args) 
    {
    	//create new class, set the amount of numbers being randomised
    	RandomListing count = new SimpleRandomListing(100);
    	//print in debug log for testing purposes, not advised
    	System.out.println(Arrays.toString(count.getArray())+ count.printTime());
    }

} // End of class SimpleRandomCount