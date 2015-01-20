# Array Problems

+ Use the array backwards
  - Remove element in place: use two pointers(one from front to end, another one from end to front), if found given element, overwrite current position with element that end pointer points to and move end pointer backward; otherwise, just move front pointer forward
  - Merge sorted array: compare elements backwards in both arrays and put larger element into the end of larger array


+ Remove Duplicates
  - Remove Duplicate Sorted Array: use two pointers, one to find next distinct number, and another to track the position to insert this distinct number
  - Remove Duplicate Sorted Array 2: use similar method above, use one pointer for current position and another pointer to find next different number while counting the occurence; based on number of occurences, move current position by 2 or by 1 and overwrite spots with correct value


+ Majority Element
  - Moore's Voting Algorithm: idea is to cancel out occurence of element e by occurence of elements different from e, then e will exist if it is majority element


+ 2D Array
  - Spiral Matrix: since matrix might not be a square matrix, use smaller dimension to compute number of layers; then traverse elements layer by layer (top, right, bottom, left); in the end, if smaller dimension is odd, we need to traverse a single line containing rest of numbers
  - Spiral Matrix2: use same method above to traverse matrix in spiral order
  - Rotate Image: rotate layer by layer(layer++) and continue to proceed if side length is greater than 0 (side -= 2)
  - Set Matrix Zero: use first row and first column to mark rows and columns needed to be set to zeros; first traverse first row and column if they need to be set to zero and then traverse the rest of matrix and flag corresponding rows and columns; in the end, use flags to set zeros


+ k Sum Problems
  - Two Sum: use hashmap to store (target-arr[i], i) pairs; while traversing the array, if arr[k] is in hashmap, return index pair (map.get(arr[k])+1,k+1); if no additional space allowed, use two pointers, one points to current value, use another one to traverse the rest of array to find counterpart; to improve time efficiency, consider sort the copy array first, then use two pointers to approach target value by moving front and tail pointers to middle, and lastly find original index in the original array

+ Triangle arrays
  - Pascal Triangle: list(i) = prevlist(i-1) + prevlist(i)
  - Pascal Triangle2: use list or use relationship C(n,k+1) = C(n,k)*((n-k)/(k+1))
  - Triangle: initialize a 1D dp array by using values of last row, for each row from bottom to top, update each position by (value in the row above)+min(two adjacent values in current row)


+ Backtracking
  - Word search: use boolean board to mark visited, use DFS to try each possible position; count length to check if terminate
  - Subsets: first sort the original set to guarantee generated subsets are in non-descending order; use a parameter(a start index of original set) to confine that subsequent generation only uses elements after current element; then loop through sorted set, after adding current element, store into result as a subset, and use recursion to generate more subsets using elements after current element, in the end, remove current element and try next element for next round
  - Subsets2: if the original subsets might contain duplicates, we need to modify the method above such that after remove current element and before try next element for next round, we need to make sure the next element to try is not the same number we have removed; therefore before going into next round, check if next element is the same as removed element, if so, keep going forward until reach a different element

+ Dynamic Programming
  - Unique path: dynamic programming, #ways to get (i,j) = #from up + #from left, and initial condition is (i,0)=(0,i)=1 since we can only keep going down or right to reach those positions
  - Unique path2: modify the method above so that we consider the impact of obstacle on initial conditions(i.e. zero path to all positions behind obstacles); while using the iteration formula, set value to 0 if encounter an obstacle(i.e. zero path to reach the position comming from an obstacle)

+ Sorting and Searching
  - Sort colors: since we only have three elements in this case, use counting sort to count occurrence of each elements in one pass and overwrite elements in sorted order in another pass; we can also use one-pass algorithm with constant space, while traversing the array, check index range(indexof(0)>front and indexof(2)<end) and push smallest element to the front and push largest element to the end
  - Search Insert Position: simply try each interval range in the array 
  - Search For Range: search starting position first, and then start from there, search for ending position
  - Search Rotated Sorted Array: use two pointers (i.e. low and high) to perform binary search; adjust low and high bounday by comparing arr[low] and arr[mid], if arr[low]<=arr[mid], then left subarray is an increasing sequence, otherwise, right subarray is an increasing sequence; then adjust bounday by determining the range in which target is in
  - Search Rotated Sorted Array2: if duplicates allowed, we can be sure left subarray is an increasing sequence when arr[low]<=arr[mid], for example, [1,3,1,1,1]; then we need to stricten the condition to be arr[low]<arr[mid] to ensure an increasing sequence; if arr[low]=arr[mid], move low pointer forward until we can make a clear decision
  - Search 2D Matrix: first rule out some immediate cases; then perform a binary search on rows and then perform a binary search on columns


+ Math
  - Plus One: use modulo and division, remember to care of adding extra digit
  

+ Immediate case to check
  - array == null
  - array.length == 0