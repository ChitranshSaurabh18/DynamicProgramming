package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.PaperCutIntoMinSquares.*;

/**
 * @author Saurabh, Chitransh
 */
public class PaperCutIntoMinSquaresTest {

    @Test
    public void testMinSquares () throws Exception {
        assertEquals(5, minSquares(36, 30));
        assertEquals(5, minSquares(4, 5));
    }
}