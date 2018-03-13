package intArrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.event.ListSelectionEvent;

import search.IndexingError;

public class CleverRandomListing extends RandomListing
{

	public CleverRandomListing(int size)
	{
		super(size);
		// TODO Auto-generated constructor stub
	}

	
	protected void randomise() 
	{	
		setUp(); //start timer
	
		int[] copy = getArray(); //create an int array and fill it
		int j; //create int j
		/*
		 * this for loop will swap position i and a random position
		 * */
		for(int i : copy) //for every int in copy
		{
			int randomPos = getRandomIndex(); //store a random int in the array
			
			j = copy[i]; //make j equal pos i
			
			copy[i] = copy[randomPos]; //make position i of the array equal the one from a random pos
			
			copy[randomPos] = j; //make a randompos in the array equal the the one in pos i
			
			
		}	
		//set the array to equal the new randomised copy
		for (int index = 0; index < getArray().length; index ++) 
	    {
	        	
	            getArray()[index] = copy[index]; 
	    }
		//end timer
		tearDown();
	}
	public static void main(String[] args) 
	{
	    //create new class, set the amount of numbers being randomised
	    RandomListing count = new CleverRandomListing(100);
	    //print in debug log for testing purposes, not advised
	    System.out.println(Arrays.toString(count.getArray()) + count.printTime());
	    
	}
}
