package arraySorter;

import RandomArray.RandomArray;
import RandomArray.RandomIntegerArray;

public class QuickSortTimer 
{
	public static void main(String[] args) 
	{
		QuickSort<Integer> sorter = new QuickSort<Integer>();
		RandomArray<Integer> generator = new RandomIntegerArray(100000);
		sorter.timeInMillis(generator, 10, 1);
	}

}
