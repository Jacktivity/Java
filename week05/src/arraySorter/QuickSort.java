package arraySorter;

import java.util.Arrays;

public class QuickSort<T extends Comparable<? super T>> extends ArraySortTool<T> {

	@Override
	public void sort(T[] array)
	{
		System.out.println(Arrays.toString(array));
		quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}
	int partition(T array[], int left, int right) 
	{

		int leftPos = left, rightPos = right;
		T tmp;
		T pivot = array[(left + right) / 2];

		for (int index = 0; index <= rightPos; index++) 
		{

			while (array[leftPos].compareTo(pivot) < 0) leftPos++;

			while (pivot.compareTo(array[rightPos]) < 0) rightPos--;

			if (leftPos <= rightPos) 
			{
				tmp = array[leftPos];
				array[leftPos] = array[rightPos];
				array[rightPos] = tmp;
				leftPos++;
				rightPos--;
			}
		};
		return leftPos;
	}
	void quickSort(T[] arr, int left, int right) 
	{

		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}
}
