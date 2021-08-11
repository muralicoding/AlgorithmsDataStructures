package com.leetcode.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
	private List<Integer> data;
	private int p_start;
	
	public MyQueue() {
		super();
		data = new ArrayList<Integer>();
		p_start = 0;
	}
	
	public boolean enQueue(int x) {
		data.add(x);
		return true;
	}
	
	public boolean deQueue() {
		if(isEmpty() == true) {
			return false;
		}
		p_start = p_start + 1;
		return true;
	}
	
	public int Front() {
		return data.get(p_start);
	}
	
	public boolean isEmpty() {
		return p_start >= data.size();
	}
	
	
	
}
