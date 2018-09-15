package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.SequenceAlignment.*;

/**
 * @author Saurabh, Chitransh
 */
public class SequenceAlignmentTest {

    @Test
    public void testAlignmentCost () throws Exception {
        assertEquals(0, alignmentCost("GCCCTAGCG", "GCGCAATG", 1, -1, -2));
    }
}