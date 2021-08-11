
public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers =  {2,7,11,15};
		int target = 9;
		
		int[] output = new int[2];
		int i = 0;
		int j = numbers.length - 1;
		
		while(i < j) {
			System.out.println(numbers[i]);
			System.out.println(numbers[j]);
			if(target == numbers[i] + numbers[j]) {
				output[0] = i + 1;
				output[1] = j + 1;
				System.out.println(output);
				System.out.println("End");
			}
			if(target < numbers[i] + numbers[j]) {
				j--;
			}else {
				i++;
			}
		}
	}

}
