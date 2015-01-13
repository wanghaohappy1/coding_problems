# LinkedList techniques

+ Corner cases to check in the list:
  - head is null
  - only one node in the list (head.next==null)
  - given input does not match list structure (exp. exceed length of list)

+ Cycle in the list:
  - detect: use fast/slow runner until fast or fast.next reaches null, then no cycle exists; if slow and fast runner meets while moving, then cycle exists.
  - find head of the cycle: suppose the cycle exists and its perimeter is L, when fast and slow runner meets, fast runner travels a + b + n*L where n is the number of cycles fast runner has gone through and slow runner only travels a + b. Then we know that 2(a+b) = a+b+n*L, which gives a=n*L-b and this means if we move one runner to the list head and leave the other one at the meeting point, after moving them at the same speed for same steps, they will meet the loop head. 

+ Intersection of two lists:
  - compute difference in lengths, move pointers to the same front, then move pointers at same speed to check if they will meet
  - traverse one of list to the end and make a cycle by linking last element and head, then problem becomes finding the loop head if intersection exists; since we know the length of one lists(i.e. the length of cycle), we can move pointer of another list by this amount and put another pointer at the head, move them at the same speed to check if they will meet; at last, remove the cycle in the list

+ Find n-th last node in the list:
  - use two pointers, one(p1) stays at the head, and move another one(p2) n steps ahead; then move them at the same speed until p2 becomes null. at this time, p1 is the n-th last node in the list. Be careful when the node we want is the head, in this case, when we move p2 n steps forward, it will become null so that we can quickly recognize the case. Lastly, the given n value may exceed the length of list, this can be recognized while moving p2 forwards, it becomes null but reduced n is still positive. 

+ Merge sorted lists:
  - merge two lists: create a dummy head, use two pointers to traverse two lists and select smaller node to attach to the result list

  - merge multiple lists: one approach is to use heap(priority queue), after removing the smallest node from heap, enqueue the next element in the same list; another approach is from the idea of merge sort, keep dividing lists in half and eventually reduce to the problem of merging two sorted lists as above

+ Sort list:
  - use the idea of merge sort, apply fast/slow runner to find the middle element and separate into two sublists, recursively call sort on each sublists and eventually reduced to the problems of mergign two sorted lists as above

+ Remove duplicates:
  - sorted list: usually use two pointers to track current number and next number
  - unsorted lists: use merge sort to sort list first and use simple approach as above

+ Common errors:
  - Null pointer: when use node or node.next, be sure to check if it might be null at first
  - Infinite loop: conditions about pointer always satisfied