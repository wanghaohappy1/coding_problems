

Summary of some [LeetCode](https://oj.leetcode.com/problems/) problems marked as easy in difficulty.

Solutions are on my [Github](https://github.com/startupjing/coding_problems)

<!-- more -->

Contents:

- [Lists](#Lists)

- [Arrays](#Arrays)

- [Strings](#Strings)

- [Trees](#Trees)

- [Math and Integers](#Math and Integers)

- [Stack](#Stack)

- [Dynamic Programming](#Dynamic Programming)

<a name="Lists"/>

### Lists

* Linked List Cycle:

Use fast/slow runner technique. Fast and slow runner will eventually meet if a cycle exists. Otherwise, fast runner will hit null

* Swap Node Pair:

Use two pointers to adjacent nodes and link two nodes to previous swapped list


<a name="Arrays"/>

### Arrays

* Single Number:

If additional space allowed, use a hashset to store(first time) and remove(second time) elements. If space not allowed, use XOR operation since y XOR y = 0;

* Search Insert Position:n

Simple array traversal

* Minimum Rotated Sorted Array:

The first element such that arr[i-1]>arr[i] is the min element.



<a name="Strings"/>

### Strings



<a name="Trees"/>

### Trees

* Binary Tree Inorder Traversal:

Use a stack to store parent nodes. Traverse to the left until reaching a leaf, then pop parent node from stack and switch to parent's right subtree.

* Binary Tree Preorder Traversal:

Use a stack to store roots. Visit root first, then store root of right subtree into stack, switch to visit left subtree until reaching a leaf, then pop right subtree from stack and visit

* Populate Next Right Pointer:

First connect two children of the same parent, then connect neighbor children of neighbor parents, and finally do recursion on left/right subtrees

* Sorted Array to BST:

Build root using middle element, and build left/right child using recursion on left/right subarrays

<a name="Math and Integers"/>

### Math and Integers

* Single Number 2:

Sum up bit at each position and modulo 3 to get single number

* Integer to Roman:

First build mapping between integer values and Roman numerals including subtractive notations. Then use modulo operation to convert bases to Roman numerals

<a name="Stack"/>

### Stack



<a name="Dynamic Programming"/>

### Dynamic Programming

* Unique Binary Trees:

Suppose tree[i]=#trees given value i, then tree[i]+=(#left tree)*(#right tree) for each possible root value j=1,2,3..i

* Maximum SubArray:

Dynamic programming -- track max_so_far and upate max_end_here; Divide and conquer -- max(max left subarray, max right subarray, max subarray crossing midpoint)



