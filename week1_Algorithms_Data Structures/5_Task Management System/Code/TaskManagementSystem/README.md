## Explain the different types of linked lists (Singly Linked List, Doubly Linked List).
A linked list is a data structure consisting of a sequence of elements, where each element (node) contains a reference (link) to the next element in the sequence. There are several types of linked lists, each with its own characteristics:
1. **Singly Linked List**:
   - Each node contains data and a reference to the next node.
   - Traversal is only possible in one direction (from head to tail).
   - Memory-efficient for simple operations like insertion and deletion at the head or tail.
   - Example structure:
     ```
     Head -> [Data | Next] -> [Data | Next] -> NULL
     ```
2. **Doubly Linked List**:
   - Each node contains data, a reference to the next node, and a reference to the previous node.
   - Allows traversal in both directions (forward and backward).
   - More memory overhead due to the additional pointer but provides more flexibility for operations.
   - Example structure:
     ```
     NULL <- [Prev | Data | Next] <-> [Prev | Data | Next] <-> NULL
     ```
     
## Analyze the time complexity of each operation.
| Operation | Time Complexity |
|-----------|-----------------|
| add       | O(n)            |
| delete    | O(n)            |
| search    | O(n)            |
|traverse   | O(n)            |

## Discuss the advantages of linked lists over arrays for dynamic data.
1. **Dynamic Size**: Linked lists can grow and shrink in size dynamically, allowing for efficient memory usage without the need to allocate a fixed size upfront.
2. **Efficient Insertions/Deletions**: Inserting or deleting nodes in a linked list can be done in O(1) time if the node reference is known, while arrays require shifting elements, leading to O(n) time complexity.
3. **No Memory Waste**: Linked lists do not require a contiguous block of memory, which can lead to fragmentation issues in arrays. Each node can be allocated independently, making better use of available memory.
4. **Flexibility**: Linked lists can easily adapt to varying data sizes and structures, allowing for more complex data representations like stacks, queues, and graphs without needing to resize or reallocate memory.