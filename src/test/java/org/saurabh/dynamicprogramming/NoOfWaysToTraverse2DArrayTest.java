package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.NoOfWaysToTraverse2DArray.*;

/**
 * @author Saurabh, Chitransh
 */
public class NoOfWaysToTraverse2DArrayTest {

    @Test
    public void testNoOfWays () throws Exception {
        assertEquals(6, noOfWays(3, 3));
    }
}