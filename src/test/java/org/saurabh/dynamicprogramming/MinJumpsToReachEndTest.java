package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.saurabh.dynamicprogramming.MinJumpsToReachEnd.minJumps;

/**
 * @author Saurabh, Chitransh
 */
public class MinJumpsToReachEndTest {

    @Test
    public void testMinJumps () throws Exception {
        assertEquals(3, minJumps(1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9));
    }
}