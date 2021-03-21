package com.ucsd.week3;

public class SearchAlgorithms {

    /**
     * Linear Search
     *
     * @param word
     * @param letter
     * @return boolean
     */
    public static boolean hasLetter(String word, char letter) {
        char[] charArray = word.toCharArray();
        for (char c : charArray) {
            if (c == letter) {
                return true;
            }
        }
        return false;
    }


    /**
     * Binary Search (requires sorted list)
     *
     * @param numbers
     * @param num
     * @return boolean
     */
    public static boolean hasNumber(int[] numbers, int num) {
        int low = 0;
        int high = numbers.length;

        while (low <= high) {
           int mid = (high + low) / 2;
           if (mid == num) {
               return true;
           }
           if (num < mid) {
               high = mid - 1;
           }
           if (num > mid) {
               low = mid + 1;
           }
        }
        return false;
    }
}
