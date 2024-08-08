package org.example;

public class MergeSort {

    // Method to call merge sort
    public static void mergeSortDescending(int[] array) {
        if (array == null || array.length <= 1) {
            return; // If the array is empty or has one element, there is no need to sort
        }
        mergeSort(array, 0, array.length - 1);
    }

    // Recursive method for splitting an array and merging its parts
    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Recursively sort the left and right halves
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            // Drain the sorted halves
            MergeHelper.merge(array, left, middle, right);
        }
    }
}

