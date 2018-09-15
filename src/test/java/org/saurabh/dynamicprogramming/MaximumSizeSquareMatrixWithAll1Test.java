package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.MaximumSizeSquareMatrixWithAll1.*;

/**
 * @author Saurabh, Chitransh
 */
public class MaximumSizeSquareMatrixWithAll1Test {

    @Test
    public void testMaxSubSquareSize () throws Exception {
        int[][] array = {
                {0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}
        };

        assertEquals(3, maxSubSquareSize(array));
    }
}