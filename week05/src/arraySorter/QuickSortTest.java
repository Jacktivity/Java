package arraySorter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import RandomArray.RandomArray;
import RandomArray.RandomIntegerArray;

public class QuickSortTest extends SortTester<Integer>
{
	private QuickSort<Integer> sorter = new QuickSort<Integer>();
	private RandomArray<Integer> generator = new RandomIntegerArray(10);
	
	private static long testStart, testEnd;
    /**
     * Default constructor for test class QuickSortTest
     */
	
    public QuickSortTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    protected void setUp()
    {
    	testStart = System.nanoTime();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    protected void tearDown()
    {
		testEnd = System.nanoTime();
		
    }
    @Test
    public void test1()
    {
        super.test(sorter,generator,1);
    
    }
    @Test
    public void test2()
    {
        super.test(sorter,generator,2);
        
    }
    @Test
    public void test3()
    {
        super.test(sorter,generator,3);
        
    }
    @Test
    public void test4()
    {
        super.test(sorter,generator,4);

    }
    @Test
    public void test5()
    {
        super.test(sorter,generator,5);
       
    }
    @Test
    public void test6()
    {
        super.test(sorter,generator,6);
   
    }
    @Test
    public void test7()
    {
        super.test(sorter,generator,7);
       
    }
    @Test
    public void test8()
    {
        super.test(sorter,generator,8);
       
    }
    @Test
    public void test9()
    {
        super.test(sorter,generator,9);

    }
    @Test
    public void test10()
    {
        super.test(sorter,generator,10);
    
    }

}
