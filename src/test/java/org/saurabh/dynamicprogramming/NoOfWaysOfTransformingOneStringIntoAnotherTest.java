package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.NoOfWaysOfTransformingOneStringIntoAnother.*;

/**
 * @author Saurabh, Chitransh
 */
public class NoOfWaysOfTransformingOneStringIntoAnotherTest {

    @Test
    public void testNoOfWaysToTransform () throws Exception {
        assertEquals(3, noOfWaysToTransform("abcccdf", "abccdf"));
        assertEquals(4, noOfWaysToTransform("aabba", "ab"));
    }
}