
public class minSubArrayLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int target = 11; 
		
		    int[] nums = {1,2,3,4,5};
		    
			int min = Integer.MAX_VALUE;
	        int sum = 0;
	        int left = 0;
	     
	 
	        
	        //Loop through the list using fast index i.e right
	        	        
	        for(int right = 0; right < nums.length; right++) {
	        	sum += nums[right];
	        	
	        	while(sum >= target){
	        		min = Math.min(min, right+1 - left);
	        		sum -= nums[left];
	        		left++;
	        	}
	        }
	        System.out.println(min);
	}

}
