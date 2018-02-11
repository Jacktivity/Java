package search;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import intArrays.RandomListing;
import intArrays.SimpleRandomListing;

public class CleverSearchTimerTest extends TimedTests
{
	SearchTimer testSearchTimer = new CleverSearchTimer();
	@Test
	public void test() throws IndexingError 
	{
		testKofN(testSearchTimer, 4, 10);
	}
}
