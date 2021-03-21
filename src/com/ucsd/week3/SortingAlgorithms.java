package com.ucsd.week3;

public class SortingAlgorithms {

    /**
     * Best Case O(n^2)
     * Avg Case O(n^2)
     * Worst Case O(n^2)
     */
    public static int[] selectionSort(int[] vals) {
        for (int i = 0; i < vals.length - 1; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < vals.length; j++) {
                if (vals[j] < vals[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            int smallerNumber = vals[minimumIndex];
            vals[minimumIndex] = vals[i];
            vals[i] = smallerNumber;
        }
        return vals;
    }

    /**
     * Best Case O(n)
     * Avg Case O(n^2)
     * Worst Case O(n^2)
     */
    public static int[] insertionSort(int[] vals) {
        int temp;
        for (int i = 1; i < vals.length; i++) {
            for (int j = i; j > 0; j--) {
                if (vals[j] < vals[j-1]) {
                   temp = vals[j];
                   vals[j] = vals[j-1];
                   vals[j-1] = temp;
                }
            }
        }
        return vals;
    }

    /**
     * Best Case O(n log n)
     * Avg Case O(n log n)
     * Worst Case O(n log n)
     */
    public static int[] mergeSort(int[] vals) {
        return vals;
    }

    /**
     * Best Case O(n log n)
     * Avg Case O(n log n)
     * Worst Case O(n^2)
     */
    public static int[] quickSort(int[] vals) {
        return vals;
    }
}
