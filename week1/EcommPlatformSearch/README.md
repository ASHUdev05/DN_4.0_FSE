## Explain Big O notation and how it helps in analyzing algorithms.
Big O notation is a mathematical notation used to describe the upper bound of an algorithm's time or space complexity in terms of the size of the input data. 
It provides a high-level understanding of how the performance of an algorithm scales as the input size increases, allowing developers and computer scientists to analyze and compare the efficiency of different algorithms.

## Describe the best, average, and worst-case scenarios for search operations.
- **Best Case**: The best-case scenario occurs when the desired element is found immediately, such as when searching for an element in a sorted array and it is the first element. The time complexity is O(1).
- **Average Case**: The average-case scenario considers the expected time taken to find an element when the search is performed on a random distribution of elements. For example, in a linear search, the average case is O(n) because, on average, half of the elements need to be checked.
- **Worst Case**: The worst-case scenario occurs when the desired element is not present in the data structure or is located at the end. For example, in a linear search, the worst case is O(n) because all elements must be checked before concluding that the element is not present.

## Algorithm -> Time Complexity	
Linear Search -> O(n)

Binary Search -> O(log n)


Binary Search is more suitable for our case, since the platform requires frequent searches in a sorted array.
The array needs to pre sorted at the time of stock update to ensure that the binary search can be performed efficiently.