
public class SearchinRotatedSortedArray {

	public static void main(String[] args) {
		int[] input = {1, 3};
		int target = 3;
		int output = search(input, target);
		System.out.println(output);
		

	}
	public static int search(int[] nums, int target) {
	       if(nums.length == 0) return -1;
	       
	        int left = 0, right = nums.length - 1;
	        int mid = 0;
	  
	        while(left < right){
	            mid = left + (right - left) / 2;
	            if(nums[mid] > nums[right]){
	                left = mid + 1;
	            }else{
	                right = mid;
	            }
	        }
	        
	        //[1, 3]
	        		
	        System.out.println(left + " ** ");
	        	
	        int pivot = left;
	        left = 0;
	        right = nums.length - 1;
	        
	        if(target > nums[right]){
	            right = pivot; 
	        }else{
	            left = pivot;
	        }
	        
	        System.out.println(left);
	        System.out.println(right);
	        
	        
	        while(left <= right){
	            mid = left + (right - left) / 2;
	            if(nums[mid] == target) return mid;
	            if(nums[mid] > target) right = mid - 1;
	            if(nums[mid] < target) left = mid + 1;
	        }
	        return - 1;
	    }

}
