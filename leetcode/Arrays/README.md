# Array Problems

+ Use the array backwards
  - Remove element in place: use two pointers(one from front to end, another one from end to front), if found given element, overwrite current position with element that end pointer points to and move end pointer backward; otherwise, just move front pointer forward
  - Merge sorted array: compare elements backwards in both arrays and put larger element into the end of larger array


+ Remove Duplicates
  - sorted array: use two pointers, one to find next distinct number, and another to track the position to insert this distinct number


+ Majority Element
  - Moore's Voting Algorithm: idea is to cancel out occurence of element e by occurence of elements different from e, then e will exist if it is majority element


+ 2D board
  - Word search: use boolean board to mark visited, use DFS to try each possible position; count length to check if terminate
  - Unique path: dynamic programming, #ways to get (i,j) = #from up + #from left, and initial condition is (i,0)=(0,i)=1 since we can only keep going down or right to reach those positions
  - Unique path2: modify the method above so that we consider the impact of obstacle on initial conditions(i.e. zero path to all positions behind obstacles); while using the iteration formula, set value to 0 if encounter an obstacle(i.e. zero path to reach the position comming from an obstacle)

+ k Sum Problems
  - Two Sum: use hashmap to store (target-arr[i], i) pairs; while traversing the array, if arr[k] is in hashmap, return index pair (map.get(arr[k])+1,k+1); if no additional space allowed, use two pointers, one points to current value, use another one to traverse the rest of array to find counterpart; to improve time efficiency, consider sort the copy array first, then use two pointers to approach target value by moving front and tail pointers to middle, and lastly find original index in the original array

+ Triangle arrays
  - Pascal Triangle: list(i) = prevlist(i-1) + prevlist(i)
  - Pascal Triangle2: use list or use relationship C(n,k+1) = C(n,k)*((n-k)/(k+1))
  - Triangle: initialize a 1D dp array by using values of last row, for each row from bottom to top, update each position by (value in the row above)+min(two adjacent values in current row)


+ Math
  - Plus One: use modulo and division, remember to care of adding extra digit
  

+ Immediate case to check
  - array == null
  - array.length == 0