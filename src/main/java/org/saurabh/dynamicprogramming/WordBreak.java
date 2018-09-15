package org.saurabh.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Problem Link: https://www.geeksforgeeks.org/word-break-problem-dp-32/
 *
 * @author Saurabh, Chitransh
 */
public class WordBreak {

    public static boolean isWordBreakPossible (String word, Set<String> dictionary) {
        int n = word.length();

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            if (dp[i] != -1) {
                for (int j = i + 1; j <= n; j++) {
                    String substring = word.substring(i, j);
                    if (dictionary.contains(substring)) {
                        dp[j] = i;
                    }
                }
            }
        }

        return dp[n] != -1;
    }

    public static List<String> wordBreak (String word, Set<String> dictionary) {
        List<String> words = new ArrayList<>();

        int n = word.length();

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            if (dp[i] != -1) {
                for (int j = i + 1; j <= n; j++) {
                    String substring = word.substring(i, j);
                    if (dictionary.contains(substring)) {
                        dp[j] = i;
                    }
                }
            }
        }

        if (dp[n] != -1) {
            int i = n;
            while (i != 0) {
                words.add(0, word.substring(dp[i], i));
                i = dp[i];
            }
        }

        return words;
    }
}
