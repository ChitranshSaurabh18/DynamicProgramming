package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.DominoesTiling3XN.*;

/**
 * @author Saurabh, Chitransh
 */
public class DominoesTiling3XNTest {

    @Test
    public void testNoOfWaysOfTiling () throws Exception {
        assertEquals(0, noOfWaysOfTiling(1));
        assertEquals(1, noOfWaysOfTiling(0));
        assertEquals(3, noOfWaysOfTiling(2));
        assertEquals(153, noOfWaysOfTiling(8));
        assertEquals(2131, noOfWaysOfTiling(12));
        assertEquals(299303201, noOfWaysOfTiling(30));
    }
}