import java.util.Arrays;

public class arrayPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input: nums = [1,4,3,2]
//				Output: 4
//				Explanation: All possible pairings (ignoring the ordering of elements) are:
//				1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
//				2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
//				3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
//				So the maximum possible sum is 4.
//				
//				
//		Input: nums = [6,2,6,5,1,2]
//		Output: 9
//		Explanation: The optimal pairing is (2, 1), (2, 5), (6, 6). min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9.
		
		int[] nums = {6,2,6,5,1,2};
		
		Arrays.sort(nums);
		
		/*
		 * for(int x: nums){ System.out.println(x); }
		 */
		
		int sum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(i % 2 == 0) {
				sum += nums[i];
			}
		}
		
		System.out.println(sum);
		
		
	}
}
