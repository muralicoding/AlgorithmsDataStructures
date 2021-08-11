
public class findMaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,0,1,1,1};
		
		 int max = 0;
	        int cur_max = 0;
	        for(int i=0; i<nums.length; i++){
	            if(nums[i] == 1){
	                cur_max++;
	            }else{
	                if(cur_max > max){
	                    max = cur_max;
	                }
	                cur_max = 0;
	            }
	        }
	        if(cur_max > max){
	            max = cur_max;
	        }
	        System.out.println(max);
	}

}
