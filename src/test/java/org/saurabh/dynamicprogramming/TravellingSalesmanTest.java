package org.saurabh.dynamicprogramming;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.TravellingSalesman.*;

/**
 * @author Saurabh, Chitransh
 */
public class TravellingSalesmanTest {

    @Test
    public void testTravellingSalesman () throws Exception {
        int[][] distance = {
                {0, 1, 15, 6},
                {2, 0, 7, 3},
                {9, 6, 0, 12},
                {10, 4, 8, 0}
        };

        TravellingSalesman tsp = new TravellingSalesman(0, distance);
        assertEquals(21, tsp.getMinCostPath());
        assertEquals(Lists.newArrayList(0, 1, 3, 2, 0), tsp.getPath());
    }
}