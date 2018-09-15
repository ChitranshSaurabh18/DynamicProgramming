package org.saurabh.dynamicprogramming;

import java.util.Arrays;

/**
 * Problem Link: https://www.geeksforgeeks.org/weighted-job-scheduling/
 *
 * @author Saurabh, Chitransh
 */
public class WeightedIntervalScheduling {

    public static int weightedIntervalScheduling (Job... jobs) {
        Arrays.sort(jobs);
        int n = jobs.length;

        // p[j] = largest index i < j such that job i is compatible with j
        int[] p = new int[n];
        for (int i = 1; i < n; i++) {
            int startTime = jobs[i].start;
            for (int j = i - 1; j >= 0; j--) {
                if (jobs[j].finish <= startTime) {
                    p[i] = j;
                    break;
                }
            }
        }

        int[] dp = new int[n];
        dp[0] = jobs[0].weight;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], jobs[i].weight + dp[p[i]]);
        }

        return dp[n - 1];
    }

    public static class Job implements Comparable<Job> {
        private Integer start;
        private Integer finish;
        private Integer weight;

        public Job (Integer start, Integer finish, Integer weight) {
            this.start = start;
            this.finish = finish;
            this.weight = weight;
        }

        @Override
        public int compareTo (Job that) {
            return this.finish.compareTo(that.finish);
        }
    }
}
