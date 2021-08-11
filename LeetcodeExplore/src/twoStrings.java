import java.util.*;

public class twoStrings {

	public static void main(String[] args) {
		String s1 = "hi";
		String s2 = "world";
		
		System.out.println(helper(s1, s2));

	}
	public static String helper(String s1, String s2) {
		String answer = "No";
		int len = s1.length();
		HashSet<String> mapping = new HashSet<String>();
		for(int i = 0; i < len; i++) {
			char c = s1.charAt(i);
			
		}
		
		len = s2.length();
		for(int i = 0; i < len; i++) {
			for(int j = i + 1; j <= len; j++) {
				String temp = s2.substring(i, j);
				if(mapping.contains(temp)) {
					answer = "Yes"; 
				}
			}
		}
		return answer;
	}

}
