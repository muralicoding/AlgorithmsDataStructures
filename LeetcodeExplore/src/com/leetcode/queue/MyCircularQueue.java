package com.leetcode.queue;

public class MyCircularQueue {
	private int[] data;
	private int head;
	private int tail;
	private int size;
	private int capacity;
	
	
	public MyCircularQueue(int k) {
		super();
		data = new int[5];
		head = -1;
		tail = -1;
		size = 0;
		capacity = k;
	}
	
	
	public int queueSize() {
		return size;
	}
	public int Front() {
		if(head == tail)return -1;
		return data[head];
	}
	
	public int Rear() {
		if(head == tail)return -1;
		return data[tail];
	}
	
	public boolean enQueue(int value) {
		if(size == 0) head = head + 1;
		if(isFull()) return false;
		tail = (tail + 1) % 5;
		data[tail] = value;
		size = size + 1;
		
		return true;
	}
	
	public boolean deQueue() {
		if(head == tail) {
			head = -1;
			tail = -1;
			return true;
		}
			
		head = (head + 1) % 5;
		size = size - 1;
		return true;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(size == capacity) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	//Helper Class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCircularQueue queue = new MyCircularQueue(5);
		//System.out.println("Is Queue Empty " + queue.isEmpty());
		//System.out.println("Queue Front " + queue.Front());
		//System.out.println("Queue Rear " + queue.Rear());
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		
		System.out.println("Is Queue Full " + queue.isFull());
		System.out.println("Queue Front " + queue.Front());
		System.out.println("Queue Rear " + queue.Rear());
		queue.deQueue();
		System.out.println("Queue Front " + queue.Front());
		queue.enQueue(60);
		System.out.println("Is Queue Full " + queue.isFull());
		System.out.println("Queue Front " + queue.Front());
		System.out.println("Queue Rear " + queue.Rear());
		System.out.println(queue.enQueue(70));
		System.out.println("Queue Front " + queue.Front());
		System.out.println("Queue Rear " + queue.Rear());
		queue.deQueue();
		queue.deQueue();
		System.out.println("Queue Front " + queue.Front());
		System.out.println("Queue Rear " + queue.Rear());
		System.out.println(queue.queueSize());
		System.out.println(queue.enQueue(70));
		
		System.out.println("Queue Front " + queue.Front());
		System.out.println("Queue Rear " + queue.Rear());
		System.out.println(queue.queueSize());
		
	
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
	
		System.out.println("Queue Front " + queue.Front());
		System.out.println("Queue Rear " + queue.Rear());
		//System.out.println("Queue Rear " + queue.Rear());
		//System.out.println("Is Queue Empty " + queue.isEmpty());
		//System.out.println("Is Queue Full " + queue.isFull());
	}
	
	
	
	
}
