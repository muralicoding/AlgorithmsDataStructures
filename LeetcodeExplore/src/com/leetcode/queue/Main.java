package com.leetcode.queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue queue = new MyQueue();
		System.out.println(queue.isEmpty());
		System.out.println("------------");
		System.out.println(queue.enQueue(100));
		System.out.println(queue.enQueue(200));
		System.out.println(queue.enQueue(300));
		System.out.println("------------");
		System.out.println(queue.isEmpty());
		System.out.println("------------");
		System.out.println(queue.Front());
		System.out.println(queue.deQueue());
		System.out.println(queue.Front());
		
	}

}
