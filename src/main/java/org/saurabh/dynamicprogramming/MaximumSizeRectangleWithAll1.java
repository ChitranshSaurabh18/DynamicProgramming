package org.saurabh.dynamicprogramming;

import java.util.Stack;

/**
 * Problem Link: https://www.geeksforgeeks.org/maximum-size-rectangle-binary-sub-matrix-1s/
 *
 * @author Saurabh, Chitransh
 */
public class MaximumSizeRectangleWithAll1 {

    public static int maxSizeSubRectangleArea (int[][] array) {
        int m = array.length;
        int n = array[0].length;

        int maxRectangleArea = maxRectangularArea(array[0]);
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == 1) {
                    array[i][j] = 1 + array[i - 1][j];
                }
            }

            int rectangleArea = maxRectangularArea(array[i]);
            maxRectangleArea = Math.max(rectangleArea, maxRectangleArea);
        }

        return maxRectangleArea;
    }

    private static int maxRectangularArea (int row[]) {
        Stack<Integer> indices = new Stack<>();

        int topValue;
        int maxArea = 0;
        int area = 0;

        int i = 0;
        while (i < row.length) {
            if (indices.empty() || row[indices.peek()] <= row[i]) {
                indices.push(i++);
            } else {
                topValue = row[indices.peek()];
                indices.pop();
                area = topValue * i;

                if (!indices.empty()) {
                    area = topValue * (i - indices.peek() - 1);
                }
                maxArea = Math.max(area, maxArea);
            }
        }

        while (!indices.empty()) {
            topValue = row[indices.peek()];
            indices.pop();
            area = topValue * i;
            if (!indices.empty()) {
                area = topValue * (i - indices.peek() - 1);
            }

            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }

}
