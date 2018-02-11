package search;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import intArrays.RandomListing;
import intArrays.SimpleRandomListing;

public class SimpleSearchTimerTest extends TimedTests{

	SearchTimer testSearchTimer = new SimpleSearchTimer();
	@Test
	public void test() throws IndexingError 
	{
		testKofN(testSearchTimer, 4, 10);
	}
}