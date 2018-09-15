package org.saurabh.dynamicprogramming;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.saurabh.dynamicprogramming.WeightedIntervalScheduling.*;

/**
 * @author Saurabh, Chitransh
 */
public class WeightedIntervalSchedulingTest {

    @Test
    public void testWeightedIntervalScheduling () throws Exception {
        WeightedIntervalScheduling.Job[] jobs = new WeightedIntervalScheduling.Job[4];
        jobs[0] = new WeightedIntervalScheduling.Job(1, 2, 50);
        jobs[1] = new WeightedIntervalScheduling.Job(3, 5, 20);
        jobs[2] = new WeightedIntervalScheduling.Job(6, 19, 100);
        jobs[3] = new WeightedIntervalScheduling.Job(2, 100, 200);

        assertEquals(250, weightedIntervalScheduling(jobs));
    }
}