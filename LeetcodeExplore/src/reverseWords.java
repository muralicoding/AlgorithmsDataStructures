
public class reverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = " the sky is     blue   ";
		
		char[] t = s.trim().toCharArray();
		System.out.println(t.length);
		reverseString(t, 0, t.length - 1);
		System.out.println(t);

	}
	
	public static void reverseString(char[] t, int start, int end){
        while(start < end){
            char temp = t[start];
            t[start] = t[end];
            t[end] = temp;
            start ++;
            end--;
        }
}
}
