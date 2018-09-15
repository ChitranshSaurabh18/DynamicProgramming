package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.MinimumCostPath.*;

/**
 * @author Saurabh, Chitransh
 */
public class MinimumCostPathTest {

    @Test
    public void testMaxCostPathSum () throws Exception {
        int[][] array = {
                {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}};

        assertEquals(8, minCostPathSum(array));
    }
}