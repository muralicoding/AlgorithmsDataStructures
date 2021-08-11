public class AddBinary {

	public static void main(String[] args) {
		String a = "11", b="1";
		System.out.print(addBinary(a, b));
	}
	
	static String addBinary(String a, String b) {
		StringBuilder output = new StringBuilder();
		
		int i = a.length() - 1;
		int j = b.length() - 1;
		
		int carry = 0;
		
		while(i >= 0 || j >= 0) {
			int sum = carry;
			
			if(i >= 0)sum = sum + a.charAt(i) - '0';
			
			if(j >= 0)sum = sum + b.charAt(j) - '0';
			
			output.append(sum % 2);
			
			carry = (sum / 2);
					
			i--;
			j--;
		}
		
		if(carry != 0) output.append(carry);
		
		return output.reverse().toString();
	}

}
