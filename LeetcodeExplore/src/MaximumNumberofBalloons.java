
public class MaximumNumberofBalloons {

	public static void main(String[] args) {
		String text = "loonbalxballpoon";
		System.out.println("Number of baloons " + maxNumberOfBalloons(text));
	}
	
	public static int maxNumberOfBalloons(String text) {
		int output = 0;
		
		char[] input = new char[26];
		int size = text.length();
		
		for(int i = 0; i < size; i++) {
			int temp = text.charAt(i) - 'a';
			input[temp]++;
		}
		
		output = input[1];
		output = Math.min(input[0], output);
		output = Math.min(input[11] / 2, output);
		output = Math.min(input[14] / 2, output);
		output = Math.min(input[13], output);	
		return output;
	}

}
