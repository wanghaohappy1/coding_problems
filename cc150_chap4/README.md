CC150 chap4: Trees and Graphs
========

## Check if a binary tree is balanced
* recursively check on left/right subtree
* more efficiently, use a helper function to return actual height if balanced and return -1 otherwise

## Check if a binary tree is a BST
* use in-order traversal: next element must be larger than current element
* recursively check if current element is in allowed range

## Given a sorted array, create a BST with minimum height
* use middle element in the array as root
* recursively create subtree on left/right subarray

## Generate a linkedlist for nodes at each level
* BFS: for each level, visit parents current level, then find children at next level
* pre-order: recursively build list for each level

## Determine if there is a route between two nodes in a directed graph
* BFS approach
* remember to mark node visited to avoid loop

## Find in-order successor of a node in the tree
* if node has right subtree, then return leftmost child of right subtree
* if node does not have right subtree, then
  (a) if node is its parent's left child, then return parent node
  (b) if node is right child, then return untraversed ancestor node