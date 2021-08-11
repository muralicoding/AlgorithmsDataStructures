import java.util.Arrays;
import java.util.*;

public class sherlockAndAnagrams {

	public static void main(String[] args) {
		String s = "kkkk";
		System.out.println(helper(s));
	}
	
	public static int helper(String s) {
		int answer = 0;
		int len = s.length();
		HashMap<String, Integer> mapping = new HashMap<String, Integer>();
		
		for(int i = 0; i < len; i++) {
			for(int j = i+1; j <=len; j++) {
				char[] temp = s.substring(i, j).toCharArray();
				Arrays.sort(temp);
				String str = new String(temp);
				if(mapping.containsKey(str)) {
					mapping.put(str, mapping.get(str) + 1);
				}else {
					mapping.put(str, 1);
				}
			}
		}
		
		for(String st: mapping.keySet()) {
			answer = answer + mapping.get(st);
		}
		return answer;
	}

}
