
public class Binarysearch {

	public static void main(String[] args) {
		int[] input = {2, 4, 6, 8, 10, 11};
		int target = 11;
		int output = binary1(input, target);
		int output1 = binary2(input, target);

	

	private static int binary1(int[] input, int target) {
		
		int left = 0;
		int right = input.length - 1;
		
		while(left <= right) {
			int mid = left + (right- left)/2;
			if(input[mid] == target)return mid;
			if(input[mid] > target) right = mid - 1;
			if(input[mid] < target) left = mid + 1;
		}
		return -1;
	}

	private static int binary2(int[] input, int target) {
		
		int left = 0;
		int right = input.length;
		
		while(left < right) {
			int mid = left + (right- left)/2;
			if(input[mid] == target)return mid;
			if(input[mid] > target) right = mid;
			if(input[mid] < target) left = mid + 1;
		}
		
		if(left != input.length && input[left] == target) return left;
		return -1;
	}

}
