package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Source array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Calling a method to sort an array
        MergeSort.mergeSortDescending(array);

        System.out.println("\nSorted array in descending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
