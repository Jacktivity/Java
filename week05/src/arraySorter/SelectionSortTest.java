package arraySorter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import RandomArray.RandomArray;
import RandomArray.RandomIntegerArray;

public class SelectionSortTest extends SortTester<Integer>
{
	private SelectionSort<Integer> sorter = new SelectionSort<Integer>();
	private RandomArray<Integer> generator = new RandomIntegerArray(10);
	
	private static long testStart, testEnd;
    /**
     * Default constructor for test class SelectionSortTest
     */
	
    public SelectionSortTest()
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
		System.out.println("Test " +  "took " + (testEnd-testStart)/1000);
    }
    @Test
    public void test10()
    {
        super.test(sorter,generator,10);
    }
    @Test
    public void test100()
    {
        super.test(sorter,generator,100);
    }
    @Test
    public void test1000()
    {
        super.test(sorter,generator,1000);
    }
    @Test
    public void test10000()
    {
        super.test(sorter,generator,10000);
    }
}
