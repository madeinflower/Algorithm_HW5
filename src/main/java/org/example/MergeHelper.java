package org.example;

public class MergeHelper {

    // Method for merging two sorted subarrays
    public static void merge(int[] array, int left, int middle, int right) {
        // Sizes of two subarrays
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Creating temporary arrays for storing data
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copying data to temporary arrays
        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[middle + 1 + j];
        }

        // Indexes for iterating over temporary arrays
        int i = 0, j = 0;

        // Index to iterate over the main array
        int k = left;

        // Merging temporary arrays in descending order
        while (i < n1 && j < n2) {
            if (leftArray[i] >= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements from the left subarray, if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements from the right subarray, if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

