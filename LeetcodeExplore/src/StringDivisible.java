
public class StringDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bcdbcdbcd";
		String t = "bcdbcd";
		System.out.println(findSmallestDivisor(s, t));

	}
	
	public static int findSmallestDivisor(String s, String t) {
		if(s == null || t == null || s.isEmpty() || t.isEmpty()) {
			return -1;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(t);
		
		System.out.println(sb);
		
		while(sb.length() < s.length()) {
			sb.append(t);
		}
		
		System.out.println(sb);
		
		
		
		return -1;
	}

}
