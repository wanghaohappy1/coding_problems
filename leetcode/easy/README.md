LeetCode-Easy
========

## Balanced Binary Tree
* recursively check on subtrees

## Compare two version numbers
* split on dots
* note that two version may have different number of subversions

## Intersection of two linked lists
* count number of nodes, then start traversing with same number of nodes left
* if conditions allow: alternatively, use nested loops or mark nodes visited

## Min Stack
* use additional stack to track min element

## Reverse Integer
* modulo operation
* need to check overflow case

## String to Integer
* pre-process to omit leading and trailing whitespace
* traverse the string to update integer value
* keep checking invalid character and overflow case

## Palindrome Number
* reverse and then compare (might overflow)
* use arithmetics and compare lowest/highest digit at same time

## Roman to Integer
* simply follow roman numeral definition
* use hashmap to store value pairs
* need to consider subtractive notation

## Longest Common Prefix
* scan each character for each string

## Valid Palindrome
* use stringbuffer to build a new string with only alphanumeric characters

## Pascal's Triangle
* currlist(i) = prevlist(i-1) + prevlist(i)

## Pascal's Triangle 2
* using same pattern as above
* optimized: C(n,k+1) = C(n,k)*(n-k)/(k+1)

## Remove Nth Node from End of List
* two pointers

## Valid Parentheses
* use stack to store left parentheses
* traverse the string to match right with item in the stack

## Path Sum
* recursively check on left/right subtree with reduced sum
* base case needs to make sure reached destination is a leaf

## Majority Element
* use hashmap

## Max Depth Binary Tree
* use recursion

## Min Depth Binary Tree
* if either child is null but not both, use helper function to return MAX_VALUE to ignore the child

## Same Tree
* use recursion

## Excel Sheet Column Number
* base-26 calculation

## Level Order Traversal Binary Tree
* use a queue to store nodes at each level
* for each level, enqueueu all nodes at next level, then nodes at current level to result

## Level Order Traversal Binary Tree 2
* similar to previous questions, just add level data to the head of result list

## Symmetric Tree
* use a helper function to recursively check if two subtrees are symmetric

## Remove Element
* squeeze the array by moving front forward and tail backward
* if elem found, replace it with tail element and check again

## Merge Sorted Array
* two pointers
* keep adding larger element of the two arrays from backwards

## Remove Duplicates Sorted List
* two pointers
* one to go through each different element, another one to pass through duplicates

## Remove Duplicates Sorted Array
* two pointers: num and nextNum
* set the number after num to be nextNum

## Climbing Stairs
* arr[i] = number of ways to climb n steps
* arr[i] = arr[i-1] + arr[i-2]

## Factorial Trailing Zeroes
* one pair of 2 and 5 makes a trailing zero
* count number of factor 2 and 5 from 1 to n

## Plus One
* add 1 to the end, if carryon=1, continue to add 1 to previous elements
* create a new array if no more space
