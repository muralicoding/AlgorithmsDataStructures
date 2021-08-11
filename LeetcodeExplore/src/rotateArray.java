
public class rotateArray {
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,7};
		// Output:   [5,6,7,1,2,3,4]
		int k = 3;
		
		
		k = k % nums.length;
		
		reverse(nums, 0, nums.length-1);
		
		
		reverse(nums, 0, k - 1);
		
		reverse(nums, k, nums.length-1);
		
		
	}
	public static void reverse(int nums[], int start, int end) {
		int temp = 0;
		while(start < end) {
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		
	}
}


// 1 2
// rotate 1 step 2 1 
// rotate 2 

 