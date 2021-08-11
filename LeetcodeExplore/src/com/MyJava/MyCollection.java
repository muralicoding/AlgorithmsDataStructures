package com.MyJava;

import java.util.*;

public class MyCollection {

	public static void main(String[] args) {
		
		/*
		 * boolean add(Object O)
		 * boolean addAll(Collection C)
		 * boolean remove(Object O)
		 * boolean removeAll(Collection C)
		 * boolean retainAll(Collection C)
		 * void clear()
		 * boolean isEmpty()
		 * int size()
		 * boolean contains(Object O)
		 * boolean containsAll(Collection C)
		 * Object[] toArray()
		 * Iterator iterator()
		 *  
		 */
		
		List<Integer> list = new ArrayList<>(5);
		//List<Integer> linkedlist = new LinkedList<>();
		System.out.println(list.add(1));
		System.out.println(list.add(2));
		System.out.println(list.add(3));
		System.out.println(list.add(4));
		System.out.println(list.add(5));
		System.out.println(list.add(6));
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.add(5);
		stack.add(5);
		stack.add(5);
	
		
		System.out.println(stack.firstElement());
		System.out.println(stack.lastElement());
		System.out.println(stack.peek());
		
		System.out.println(stack.capacity());
		
		
		

	}

}
