/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortalgorithm;

import java.util.Scanner;


/**
 *
 * @author Jazlan
 */
public class MergeSortAlgorithm {

   // Method to perform MergeSort
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2; // Find the middle point
            mergeSort(array, left, mid); // Recursively sort the left half
            mergeSort(array, mid + 1, right); // Recursively sort the right half
            merge(array, left, mid, right); // Merge the sorted halves
        }
    }

    // Method to merge two halves
    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1; // Size of the left subarray
        int n2 = right - mid; // Size of the right subarray

        int[] L = new int[n1]; // Temporary array for the left subarray
        int[] R = new int[n2]; // Temporary array for the right subarray

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i) // Copy elements to left subarray
            L[i] = array[left + i];
        for (int j = 0; j < n2; ++j) // Copy elements to right subarray
            R[j] = array[mid + 1 + j];

        int i = 0, j = 0; // Initial indexes of first and second subarrays
        int k = left; // Initial index of merged subarray
        while (i < n1 && j < n2) { // Merge the temp arrays back into the original array
            if (L[i] <= R[j]) { // If element in L is smaller or equal, put it in the array
                array[k] = L[i];
                i++; // Move to next element in L
            } else { // If element in R is smaller, put it in the array
                array[k] = R[j];
                j++; // Move to next element in R
            }
            k++; // Move to next position in the merged array
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Main method to test the MergeSort
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt(); // Read the number of elements
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt(); // Read the elements
        }

        mergeSort(array, 0, n - 1); // Perform MergeSort

        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) { // Print the sorted array
            System.out.print(array[i] + " ");
        }
        scanner.close(); // Close the scanner
    }
}

