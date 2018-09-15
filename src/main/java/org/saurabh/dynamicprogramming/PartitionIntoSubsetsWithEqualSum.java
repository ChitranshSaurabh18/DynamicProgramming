package org.saurabh.dynamicprogramming;

/**
 * Problem Link: https://www.geeksforgeeks.org/partition-problem-dp-18/
 *
 * @author Saurabh, Chitransh
 */
public class PartitionIntoSubsetsWithEqualSum {

    public static boolean isPartitionPossible (int... array) {
        int sum = 0;
        for (int element : array) {
            sum = sum + element;
        }

        if (sum % 2 != 0) {
            return false;
        }

        return SubsetSum.isSubsetSumPossible(sum / 2, array);     // call to subset sum problem method
    }
}
