package com.leetcode.queue;

public class queueUsingArray {
	
	private int[] queue = new int[5];
	
	private int size;
	private int front;
	private int rear;
	
	public void enQueue(int data) {
		queue[rear] = data;
		rear = rear + 1;
		size = size + 1;
	}
	
	public int deQueue() {
		int dat = queue[front];
		
		front = front + 1;
		size = size - 1;
		
		return dat;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void show() {
		System.out.print("Elements of Queue   : ");
		
	
		for(int i = 0; i < size; i++) {
			System.out.print(queue[front + i] + " ");
		}
	}
	
	// Helper class
	public static void main(String[] args) {
		queueUsingArray q1 = new queueUsingArray();
		q1.enQueue(5);
		q1.enQueue(2);
		q1.enQueue(7);
		q1.enQueue(3);
		
		
		System.out.println(q1.deQueue());
		System.out.println(q1.deQueue());
		
		q1.enQueue(9);
		q1.enQueue(1);
		
		q1.show();
	}
	
	
	
	
	
	
	

}
