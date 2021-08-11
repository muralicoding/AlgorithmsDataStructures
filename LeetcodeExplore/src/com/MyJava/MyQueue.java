package com.MyJava;

import java.util.*;


public class MyQueue {

	public static void main(String[] args) {

		// Java Queue Implementations
		// 1. LinkedList
		// 2. PriorityQueue
		
		
		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> queueA= new PriorityQueue<>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
	
		
		// Add Element to Queue
		// 1. add()
		// 2. offer()
		// Both works similar but 
		
		queue.add(1);
		queue.add(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		
		// Iterate Queue
		
		for(Integer val: queue) {
			System.out.println(val);
		}
		
		
		//int len = queue.size();
		/*for(int i = 0; i < len; i++) {
			
			System.out.println(queue.poll());
		}*/
	}

}
