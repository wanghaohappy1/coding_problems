/**
 * Problem: Implement atoi to convert a string to an integer
 *
 * Solution: pre-process to ignore whitespace, traverse the string to update integer value
 *           while checking invalid character and overflow
 */

public class StringToInteger{
	public int atoi(String str){
		//empty string
		if(str==null){
			return 0;
		}
		//omit leading and trailing whitespace
		str = str.trim();
		//string of whitespace
		if(str.length()==0){
			return 0;
		}
		int idx = 0;
		int sign = 1;
		long result = 0;
		int digit = 0;
		//determine sign bit
		if(str.charAt(idx) == '+'){
			idx ++;
		}else if(str.charAt(idx) == '-'){
			sign = -1;
			idx ++;
		}
		//traverse each character
		for(; idx<str.length(); idx++){
			//invalid character
			if(str.charAt(idx)<'0' || str.charAt(idx)>'9'){
				break;
			}
			//update integer
			digit = str.charAt(idx) - '0';
			result = result*10 + digit;
			//check overflow
			if(result*sign > Integer.MAX_VALUE){
			   return Integer.MAX_VALUE;
		    }
		    if(result*sign < Integer.MIN_VALUE){
		       return Integer.MIN_VALUE;
		    }
		}
		//check overflow again 
		if(result*sign > Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}
		if(result*sign < Integer.MIN_VALUE){
		    return Integer.MIN_VALUE;
		}
		return (int)result*sign;
	}
}