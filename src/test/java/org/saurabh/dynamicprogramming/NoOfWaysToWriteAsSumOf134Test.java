package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.NoOfWaysToWriteAsSumOf134.*;

/**
 * @author Saurabh, Chitransh
 */
public class NoOfWaysToWriteAsSumOf134Test {

    @Test
    public void testNoOfWays () throws Exception {
        assertEquals(4, noOfWays(4));
        assertEquals(6, noOfWays(5));
    }
}