package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.MaximumSizeRectangleWithAll1.*;

/**
 * @author Saurabh, Chitransh
 */
public class MaximumSizeRectangleWithAll1Test {

    @Test
    public void testMaxSizeSubRectangleArea () throws Exception {
        int[][] array = {
                {0, 1, 1, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 0}};

        assertEquals(8, maxSizeSubRectangleArea(array));
    }
}