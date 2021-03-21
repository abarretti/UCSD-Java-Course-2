package com.ucsd.week3;

public class CountingOperations {

    public static boolean hasLetter(String word, char letter) {
        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i) == letter) {
                return true;
            }
        }
        return false;
    }

    // O(n)
    public static int[] reduce(int[] vals) {
        int minIndex = 0; // O(1)
        for (int i = 0; i < vals.length ; i++) { // O(n)
            if (vals[i] < vals[minIndex]) {
                minIndex = i;
            }
        }
        int minVal = vals[minIndex]; // O(1)
        for (int i = 0; i < vals.length ; i++) { // O(n)
            vals[i] = vals[i] - minVal;
        }
        return vals;
    }

    // O(n^2)
    public static int maxDifference(int[] vals) {
        int max = 0;
        for (int i = 0; i < vals.length; i++) { // O(n)
            for (int j = 0; j < vals.length; j++) { // O(n)
                if (vals[i] - vals[j] < max) { // O(1)
                    max = vals[i] - vals[j]; // O(1)
                }
            }
        }
        return max;
    }
}

/* Operation - doesn't depend on the size of the input

    1. drop constants
    2. keep only dominant term
    3n + 3 = O(3n) = O(n)
 */
