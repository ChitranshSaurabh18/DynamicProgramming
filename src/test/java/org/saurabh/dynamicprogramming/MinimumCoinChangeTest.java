package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.MinimumCoinChange.*;

/**
 * @author Saurabh, Chitransh
 */
public class MinimumCoinChangeTest {

    @Test
    public void testMinCoinChanges () throws Exception {
        assertEquals(2, minCoinChanges(30, 25, 10, 5));
        assertEquals(2, minCoinChanges(11, 9, 6, 5, 1));
    }
}