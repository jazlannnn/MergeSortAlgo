# Merge Sort Algorithm

Introduction : Merge Sort, on the other hand, is a comparison-based sorting technique that also utilises the divide-and-conquer paradigm but approaches the problem differently. 
It divides the unsorted list into n sublists, each containing one element (a list of one element is considered sorted). Then, it repeatedly merges sublists to produce new sorted sublists until there is only one sublist remaining, 
which is the sorted list. Unlike Quick Sort, Merge Sort requires additional space proportional to the array size, but it has the advantage of being a stable sort. 
Its worst-case time complexity is also O(n log n), ensuring predictability in performance regardless of the initial order of elements.

## Diffrences Between Quick Sort And Merge Sort

Table below shows the differences between quick sort and merge sort in several basis of comparisons such as the sorting method, partition of elements in array,
usage of datasets, efficiency, stability, usual application that implement the algorithms and the time complexity:

![Screenshot 2024-10-13 163940](https://github.com/user-attachments/assets/b6cc11ea-60f0-4b7a-be67-cb8a2b7493d7)

## Time Complexity

Time Complexity : The time complexity of an algorithm is a measure of the time an algorithm takes to complete as a function of the length of the input.

- Best Case: O(n log n) - Consistent performance due to the divide-and-conquer approach.
  
- Average Case: O(n log n) - Always divides the array into two halves and merges them.

- Worst Case: O(n log n) - Performance remains consistent regardless of the initial order of elements.

## Time Complexity
