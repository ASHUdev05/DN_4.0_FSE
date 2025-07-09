## Explain different sorting algorithms (Bubble Sort, Insertion Sort, Quick Sort, Merge Sort).
### Bubble Sort:
Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. The algorithm gets its name because smaller elements "bubble" to the top of the list.

### Insertion Sort:
Insertion Sort builds a sorted array one element at a time. It takes each element from the input data and finds the location it belongs to in the sorted list, shifting the other elements as necessary. This process is repeated until the entire list is sorted.

### Quick Sort:
Quick Sort is a highly efficient sorting algorithm that uses a divide-and-conquer approach. It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.

### Merge Sort:
Merge Sort is another divide-and-conquer algorithm that divides the unsorted list into two approximately equal halves, sorts each half, and then merges the sorted halves back together. This process is repeated recursively until the entire list is sorted. Merge Sort is particularly effective for large datasets and has a guaranteed time complexity of O(n log n).

### Explain the time complexity of each sorting algorithm.
### Time Complexity:
| Algorithm      | Best Case | Average Case | Worst Case |
|----------------|-----------|--------------|------------|
| Bubble Sort    | O(n)      | O(n^2)       | O(n^2)     |
| Insertion Sort | O(n)      | O(n^2)       | O(n^2)     |
| Quick Sort     | O(n log n)| O(n log n)   | O(n^2)     |
| Merge Sort     | O(n log n)| O(n log n)   | O(n log n) |



## Compare the performance (time complexity) of Bubble Sort and Quick Sort.
| Algorithm      | Best Case | Average Case | Worst Case |
|----------------|-----------|--------------|------------|
| Bubble Sort    | O(n)      | O(n^2)       | O(n^2)     |
| Quick Sort     | O(n log n)| O(n log n)   | O(n^2)     |

## Discuss why Quick Sort is generally preferred over Bubble Sort.
Quick Sort is generally preferred over Bubble Sort due to its superior average and worst-case time complexity. While Bubble Sort has a time complexity of O(n^2) in the average and worst cases, Quick Sort achieves O(n log n) in both scenarios, making it significantly faster for larger datasets. Additionally, Quick Sort's divide-and-conquer approach allows it to sort large arrays more efficiently by reducing the problem size with each recursive call. In contrast, Bubble Sort's repeated comparisons and swaps make it inefficient for larger lists, leading to longer execution times.