package com.leetcode.binarysearchonanswer;

public class ShipWithinDays {

	public static void main(String[] args) {
		
		int[] weights =  {1,2,3,4,5,6,7,8,9,10};
		int days = 5;
		
		System.out.println(shipWithinDays(weights, days));

	}
	
	public static int shipWithinDays(int[] weights, int days) {
	    
        int size = weights.length;
        
        if(size < days)return -1;
        
        int max = 0;
        int total = 0;
        
        for(int weight : weights){
            max = Math.max(max, weight);
            total += weight;
        }
        //max = 10
        //total = 55
        int start = max;
        int end = total;
        int answer = -1;
        
        while(start <= end){
            max = start + (end - start)/2;
            if(isValid(weights, size, days, max) == true){
                end = max - 1;
                answer = max;
            }else{
                start = max + 1;
            }
        }
        return answer;
    }
    
    
    public static boolean isValid(int[] weights, int size, int days, int max){
        int day = 1;
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += weights[i];
            if(sum > max){
                day++;
                sum = weights[i];
            }
            if(day > days){
                return false;
            }
        }
        return true;
    }

}
