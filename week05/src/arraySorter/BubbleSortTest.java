package arraySorter;

import RandomArray.*;

/**
 * The test class BubbleSortTest.
 *
 * @author  Hugh Osborne
 * @version October 2016
 */
public class BubbleSortTest extends SortTester<Integer>
{
	private BubbleSort<Integer> sorter = new BubbleSort<Integer>();
	private RandomArray<Integer> generator = new RandomIntegerArray(1000000);
	
	private static long testStart, testEnd;
	
    /**
     * Default constructor for test class BubbleSortTest
     */
    public BubbleSortTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
    	testStart = System.nanoTime();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    	testEnd = System.nanoTime();
		
    }

    public void test10()
    {
        super.test(sorter,generator,10);
        tearDown();
        System.out.println("Test 10 " +  "took " + (testEnd-testStart)/1000);
    }

    public void test100()
    {
        super.test(sorter,generator,100);
        tearDown();
        System.out.println("Test 100 " +  "took " + (testEnd-testStart)/1000);
    }

    public void test1000()
    {
    
    	
        super.test(sorter,generator,1000);
        tearDown();
    	System.out.println("Test 1000 " +  "took " + (testEnd-testStart)/1000);
    }

    public void test10000()
    {
    	
    	
        super.test(sorter,generator,10000);
        tearDown();
        System.out.println("Test 10000 " +  "took " + (testEnd-testStart)/1000);
    }
}

