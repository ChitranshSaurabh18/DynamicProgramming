package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.UglyNumbers.*;

/**
 * @author Saurabh, Chitransh
 */
public class UglyNumbersTest {

    @Test
    public void testUglyNumber () throws Exception {
        assertEquals(8, uglyNumber(7));
        assertEquals(12, uglyNumber(10));
        assertEquals(24, uglyNumber(15));
        assertEquals(5832, uglyNumber(150));
    }
}