## Explain the concept of recursion and how it can simplify certain problems.
Recursion is a programming technique where a function calls itself in order to solve a problem. It is particularly useful for problems that can be broken down into smaller, similar subproblems. By solving these subproblems recursively, we can often arrive at a solution more easily than through iterative methods.

## Analysis:
Time Complexity:
T(n) = T(n-1) + O(1)

Time Complexity: O(n)

Optimization – Use Memoization or Iteration
Cache already computed results.

Useful when overlapping subproblems exist (e.g., Fibonacci-style logic).