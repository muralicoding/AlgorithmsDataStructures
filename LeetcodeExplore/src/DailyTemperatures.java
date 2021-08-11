import java.util.*;

public class DailyTemperatures {

	
	
	public static int[] dailyTemperatures(int[] temp) {
		int len = temp.length;
		int[] result = new int[len];
		Stack<Integer> stack = new Stack<Integer>();
		
		
		
		for(int i = 0; i < len; i++) {
			
			show(stack);
			while(!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
				result[stack.peek()] = i - stack.pop();
			}
			stack.push(i);
		}
		
		
		return result;	
	}
	
	public static void show(Stack<Integer> stack) {
		Iterator<Integer>value = stack.iterator();
		while(value.hasNext()) {
			System.out.print(value.next() + " ");
		}
		System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int[] temperatures = {73,74,75,71,69,72,76,73};
		
		int[] answer = dailyTemperatures(temperatures);
		
		for(int ans: answer) {
			System.out.print(ans + " ");
		}

	}

}
