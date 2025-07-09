## Explain why data structures and algorithms are essential in handling large inventories.
Scalability: Warehouses can store thousands or millions of products. Efficient access and update operations are critical.

Fast Lookup: Quickly finding products by productId is necessary to minimize delays in inventory tasks.

Efficient Updates: Regular operations like restocking, pricing changes, and order fulfillment require fast modifications.

Data Integrity: Algorithms help ensure correctness (e.g., preventing duplicate entries or out-of-stock errors).

## Discuss the types of data structures suitable for this problem.
HashMap: Ideal for large inventories. Offers constant-time (O(1)) lookup, addition, and deletion by key (productId).

TreeMap (if sorted order is needed): Balanced BST with O(log n) operations.

ArrayList: Useful for small inventories or sequential access but slow for search operations (O(n)).

## Analysis:
Time Complexities (Using HashMap)

Add -> O(1)

Update -> O(1)

Delete -> O(1)

Display All -> O(n)

### Optimization Ideas
Use TreeMap if products must be sorted by productId.

Index by other attributes (e.g., product name) using secondary maps if needed.
