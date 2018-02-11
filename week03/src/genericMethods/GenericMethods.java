package genericMethods;

import java.util.Arrays;

public class GenericMethods {	
	/**
	 * Check if two objects are equal
	 * @param object1 the first object
	 * @param object2 the second object
	 * @return true if the objects are equal (according to the equals() method)
	 */
	public static <T> boolean equals(T object1,T object2)
	{
		if (object1==null) 
		{
			return object2==null;
		} 
		else 
		{
			return object1.equals(object2);
		}
	}
	public static <T> void Swap(T[] array,int i, int j)
	{
		//Sets two variables to equal the positions I wants to swap
		T firstObject = array[i];
		T secondObject = array[j];
		//Set both positions to equal the stored variables
		array[i] = secondObject;
		array[j] = firstObject;
	}
	public static void main(String[] args)
	{
		//Makes the array which has objects that need swapping
		Object[] names = {1,"Andrew",2,"Diane",3,"Simon"};
		//Runs the swap method
		Swap(names, 1, 4);
		//Prints to the debug log for testing purposes
		System.out.println(Arrays.toString(names));
	}
}
