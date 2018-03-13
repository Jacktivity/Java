package linkedList;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import RandomArray.RandomIntegerArray;

public class SinglyLinkedListsTest
{
		@Rule
		public ExpectedException thrown = ExpectedException.none();
		
		@Test
		public void testGetFromEmpty() throws ListAccessError {
			SinglyLinkedLists<Integer> list = new SinglyLinkedLists<Integer>();
			thrown.expect(ListAccessError.class);
			thrown.expectMessage("Index out of bounds");
			list.get(0);
		}

		@Test
		public void testGetSingleton() throws ListAccessError {
			SinglyLinkedLists<Integer> list = new SinglyLinkedLists<Integer>();
			list.add(0, 5);
			assertEquals(new Integer(5),list.get(0));
		}

		@Test
		public void testGetSingletonNegative() throws ListAccessError {
			SinglyLinkedLists<Integer> list = new SinglyLinkedLists<Integer>();
			list.add(0, 5);
			thrown.expect(ListAccessError.class);
			thrown.expectMessage("Index out of bounds");
			list.get(-2);
		}

		@Test
		public void testGetSingletonOutOfBounds() throws ListAccessError {
			SinglyLinkedLists<Integer> list = new SinglyLinkedLists<Integer>();
			list.add(0, 5);
			thrown.expect(ListAccessError.class);
			thrown.expectMessage("Index out of bounds");
			list.get(2);
		}

		@Test
		public void testGet() throws ListAccessError {
			SinglyLinkedLists<Integer> list = new SinglyLinkedLists<Integer>();
			list.add(0, 5);
			list.add(1, 7);
			list.add(2, 23);
			list.add(3, -6);
			list.add(4, 0);
			list.add(5,42);
			assertEquals(new Integer(-6),list.get(3));
		}

		@Test
		public void testGetHead() throws ListAccessError {
			SinglyLinkedLists<Integer> list = new SinglyLinkedLists<Integer>();
			list.add(0, 5);
			list.add(1, 7);
			list.add(2, 23);
			list.add(3, -6);
			list.add(4, 0);
			list.add(5,42);
			assertEquals(new Integer(5),list.get(0));
		}

		@Test
		public void testGetTail() throws ListAccessError {
			SinglyLinkedLists<Integer> list = new SinglyLinkedLists<Integer>();
			list.add(0, 5);
			list.add(1, 7);
			list.add(2, 23);
			list.add(3, -6);
			list.add(4, 0);
			list.add(5,42);
			assertEquals(new Integer(42),list.get(5));
		}

		@Test
		public void testGetNegative() throws ListAccessError {
			SinglyLinkedLists<Integer> list = new SinglyLinkedLists<Integer>();
			list.add(0, 5);
			list.add(1, 7);
			list.add(2, 23);
			list.add(3, -6);
			list.add(4, 0);
			list.add(5,42);
			thrown.expect(ListAccessError.class);
			thrown.expectMessage("Index out of bounds");
			list.get(-1);
		}

		@Test
		public void testGetOutOfBounds() throws ListAccessError {
			SinglyLinkedLists<Integer> list = new SinglyLinkedLists<Integer>();
			list.add(0, 5);
			list.add(1, 7);
			list.add(2, 23);
			list.add(3, -6);
			list.add(4, 0);
			list.add(5,42);
			thrown.expect(ListAccessError.class);
			thrown.expectMessage("Index out of bounds");
			list.get(6);
		}
		@Test
		public void randomArrayTestLow() throws ListAccessError
		{
			long startTime = System.nanoTime();
			
			SinglyLinkedLists<Integer> list = new SinglyLinkedLists<Integer>();
			
			RandomIntegerArray rand = new RandomIntegerArray(500);
			Integer[] temp = rand.randomArray(500);
			
			for(int i = 0; i < temp.length; i++)
			{
				list.add(i, temp[i].intValue());
			}
			long endTime = System.nanoTime();
			System.out.println("Array Position: " + temp[375].toString() + " List Position: " + list.get(375) + " Time Taken in Microseconds: " + (endTime-startTime)/10000);
			assertEquals(temp[375],list.get(375));
		}
		@Test
		public void randomArrayTestHigh() throws ListAccessError
		{
			long startTime = System.nanoTime();
			SinglyLinkedLists<Integer> list = new SinglyLinkedLists<Integer>();
			
			RandomIntegerArray rand = new RandomIntegerArray(50000);
			Integer[] temp = rand.randomArray(50000);
			
			for(int i = 0; i < temp.length; i++)
			{
				list.add(i, temp[i].intValue());
			}
			long endTime = System.nanoTime();
			System.out.println("Array Position: " + temp[4756].toString() + " List Position: " + list.get(4756) + " Time Taken in Microseconds: " + (endTime-startTime)/10000);
			assertEquals(temp[4756],list.get(4756));
		}
		

	}

