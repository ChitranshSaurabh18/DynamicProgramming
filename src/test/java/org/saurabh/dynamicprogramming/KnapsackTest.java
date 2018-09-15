package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.Knapsack.*;

/**
 * @author Saurabh, Chitransh
 */
public class KnapsackTest {

    @Test
    public void testKnapsack () throws Exception {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        assertEquals(220, knapsack(values, weights, 50));
    }
}