/**
 * Problem: Find the majority element
 *
 * Solution: use hashmap
 */
import java.util.*;
public class MajorityElement{
	public int majorityElement(int[] num){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int len = num.length;
		//count frequency
		for(int i=0; i<len; i++){
			if(!map.containsKey(num[i])){
				map.put(num[i],1);
			}else{
				map.put(num[i],map.get(num[i])+1);
			}
		}
		int majority = 0;
		int count = 0;
		//determine majority element
		for(Integer key: map.keySet()){
			if(map.get(key)>count){
				count = map.get(key);
				majority = key;
			}

		}
		return majority;
	}
}