package com.ucsd.week3;

import java.util.Arrays;

public class Week3Main {

    public static void main(String args[]) {
        System.out.println(CountingOperations.hasLetter("San Diego", 'a'));
        System.out.println(Arrays.toString(CountingOperations.reduce(new int[] {1, 3, 5, 4})));
        System.out.println(CountingOperations.maxDifference(new int[] {1, 3, 5, 4}));
        int[] array = new int[] {5,7,3,9,1,0};
        long startTime = System.nanoTime();
        int[] sortedArray = SortingAlgorithms.selectionSort(array);
        long endTime = System.nanoTime();
        double estTime = (endTime - startTime) / 100000000.0;

        for (int i : sortedArray) {
            System.out.println(i);
        }
        System.out.println(estTime);
    }
}
