/**
 * Problem: Determine if a string is a palindrome considering only alphanumeric chars and ignore cases
 *
 * Solution: use stringbuffer to build a new string with only alphanumeric characters
 */

public class ValidPalindrome{
	public boolean isPalindrome(String s){
		if(s == null){
			return true;
		}
		StringBuffer buf = new StringBuffer();
		int len = s.length();
		//build a new string
		for(int i=0; i<len; i++){
			if((s.charAt(i)>='0' && s.charAt(i)<='9') || (s.charAt(i)>='A' && s.charAt(i)<='Z') ||(s.charAt(i)>='a' && s.charAt(i)<='z')){
                 buf.append(Character.toLowerCase(s.charAt(i)));
			}
		}
		String str = buf.toString();
		System.out.println(str);
		len = str.length();
		if(len == 0){
			return true;
		}
		int i = 0;
		int j = len-1;
		//determine if it's palindrome
		while(i < len/2){
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}