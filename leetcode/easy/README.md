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