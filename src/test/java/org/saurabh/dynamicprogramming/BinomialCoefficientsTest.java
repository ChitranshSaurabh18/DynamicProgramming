package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.BinomialCoefficients.*;

/**
 * @author Saurabh, Chitransh
 */
public class BinomialCoefficientsTest {

    @Test
    public void testBinomialCoefficient () throws Exception {
        assertEquals(5005, binomialCoefficient(15, 6));
        assertNotEquals(54624, binomialCoefficient(21, 6));     // wrong, but expected due to integer overflow
    }

    @Test
    public void testBinomialCoefficientDP () throws Exception {
        assertEquals(5005, binomialCoefficientDP(15, 6));
        assertEquals(54264, binomialCoefficientDP(21, 6));
    }
}