package arraySorter;

public class SelectionSort<T extends Comparable<? super T>> extends ArraySortTool<T>
{

	@Override
	public void sort(T[] array) 
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j<array.length;j++)
			{
				
				if(array[j].compareTo(array[i]) > 0)
				{
					T tempOb = array[j];
					array[j] = array[i];
					array[i] = tempOb;
				}
			}
		}
	}
}
