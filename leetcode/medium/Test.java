/**
 * Problem:
 *
 * Solution:
 */
import java.util.*;
public class Test{
	public static void main(String[] args){
		FourSum test = new FourSum();
		int[] num = new int[]{1,0,-1,0,-2,2};
		for(ArrayList<Integer> l: test.fourSum2(num,0)){
			for(Integer n: l){
				System.out.print(n+" ");
			}
			System.out.println();
		}

	}
}