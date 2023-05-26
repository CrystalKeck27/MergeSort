# Lab 6: Merge Sort

## Learning Outcomes
 - Use the compareTo() method from the Comparable interface to determine which of two objects is bigger
 - Understand and apply recursion in algorithm development

## Overview
In this lab, you will implement a recursive algorithm to sort elements of a list. The basic idea is to divide the list into two halves, sort each half, and then merge the two sorted halves into a single sorted list. The merge sort algorithm is a recursive algorithm that uses the divide and conquer strategy. The algorithm recursively divides the list into smaller sublists until the sublists are trivially sorted, and then merges the sublists while returning up the call chain.

## Details
You will create a class, `MergeSort`, with three class methods:
    - `public static void mergeSort(Comparable[] list)`: This method will call the private method `mergeSort(Comparable[] list, int first, int last)` to sort the entire list.
    - `private static void mergeSort(Comparable[] list, int first, int last)`:
        - If the list has more than one element, the method will divide the list into two halves and call itself recursively to sort each half.
        - The method will then call the private method `merge(Comparable[] list, int first, int mid, int last)` to merge the two sorted halves.
    - `private static void merge(Comparable[] list, int first, int mid, int last)`: This method will merge the two sorted halves of the list into a single sorted list.

## Testing
Write thorough JUnit tests for your implementation.