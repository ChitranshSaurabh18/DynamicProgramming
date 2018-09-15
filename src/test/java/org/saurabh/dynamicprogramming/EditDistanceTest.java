package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.EditDistance.*;

/**
 * @author Saurabh, Chitransh
 */
public class EditDistanceTest {

    @Test
    public void testEditDistance () throws Exception {
        assertEquals(1, editDistance("geek", "gesek", 1, 1, 1));
        assertEquals(1, editDistance("cat", "cut", 1, 1, 1));
        assertEquals(3, editDistance("sunday", "saturday", 1, 1, 1));
    }
}