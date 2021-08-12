package com.leetcode.binarysearchonanswer;

public class SplitArray {

	public static void main(String[] args) {
	
		int[] nums = {7,2,5,10,8};
		int m = 2;
		System.out.println(splitArray(nums, m));

	}
		
		public static int splitArray(int[] nums, int m) {
		     
	        int size = nums.length;
	        
	        if(size < m)return -1;
	        
	        int max = 0;
	        int total = 0;
	        
	        for(int num : nums){
	            max = Math.max(max, num);
	            total += num;
	        }
	        //max = 10
	        //total = 55
	        int start = max;
	        int end = total;
	        int answer = -1;
	        
	        while(start <= end){
	            max = start + (end - start)/2;
	            if(isValid(nums, size, m, max) == true){
	                end = max - 1;
	                answer = max;
	            }else{
	                start = max + 1;
	            }
	        }
	        return answer;
	    }
	    
	    
	    public static boolean isValid(int[] nums, int size, int m, int max){
	        int x = 1;
	        int sum = 0;
	        for(int i = 0; i < size; i++){
	            sum += nums[i];
	            if(sum > max){
	                x++;
	                sum = nums[i];
	            }
	            if(x > m){
	                return false;
	            }
	        }
	        return true;
	    }     

}
