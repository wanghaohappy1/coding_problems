//http://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/

//use bubble sort O(nk)
//use sort O(nlogn)
//use max heap(build O(n) and extra max k times O(klogn)) time O(n+klogn)


import java.util.*;
public class kLargestElements{
	public static void main(String[] args){
		int[] test = new int[]{7,5,2,4,3,9};
		int[] res = findKLargest2(test,3);
		for(int n: res){
			System.out.println(n + " ");
		}
	}

    //use outer loop of bubble sort for k times
    //time O(nk)
	public static int[] findKLargest(int[] array, int k){
		if(array == null){
			return null;
		}
		//can throw exception when length is small
		
		int len = array.length;
		for(int i=len-1; i>=len-k; i--){
			for(int j=1; j<=i; j++){
				if(array[j-1] > array[j]){
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
		int[] res = new int[k];
		int idx = 0;
		for(int i=len-1; i>=len-k; i--){
			res[idx] = array[i];
			idx ++;
		}
		return res;
	}
    
    //use priority queue
    //time O(n+klogn)
	public static int[] findKLargest2(int[] array, int k){
		if(array == null){
			return null;
		}
		int len = array.length;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(len, new Comparator<Integer>(){
			public int compare(Integer n1, Integer n2){
				return n2 - n1;
			}
		});
		for(int num: array){
			pq.offer(num);
		}
		int[] res = new int[k];
		for(int i=0; i<k; i++){
			res[i] = pq.poll();
		}
		return res;

	}




}
