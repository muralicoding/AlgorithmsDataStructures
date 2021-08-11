package com.MyJava;

import java.util.*;

public class countTriplets {

	public static void main(String[] args) {
		List<Long> arr = new ArrayList<Long>();
		
		arr.add(1l);
		arr.add(4l);
		arr.add(16l);
		arr.add(64l);
		long r = 4;
		
		int output = helper(arr, r);
		System.out.println(output);
	}
	
	public static int helper(List<Long> arr, long r) {
		int result = 0;
		
		Iterator<Long> itr = arr.iterator();
		HashMap<Long, Integer> mapping = new HashMap<Long, Integer>();
		int i = 0;
		while(itr.hasNext()) {
			long temp = itr.next();
			mapping.put(temp/r, i++);
		}
		
		for(HashMap.Entry<Long, Integer> entry: mapping.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		for(int j = 0; j <arr.size(); j++) {
			if ((mapping.containsKey(arr.get(j)/r) && (mapping.get(arr.get(j)/r) < j)) && 
					(mapping.containsKey(arr.get(j)*r) && (mapping.get(arr.get(j)*r) > j))){
				result++;
			}
		}
		return result;
	}

}
