package com.leetcode.tree;

import java.util.*;


public class BinaryTree {
	public Node root;
	
	//GEEKS FOR GEEKS
	
	//PREORDER recursive traversal
	//1. node
	//2. left
	//3. right
	List<Integer> output = new ArrayList<>();
	public void preOrderRecursive(Node root) {
		
		if(root == null)return; 
		
		output.add(root.data);
		preOrderRecursive(root.left);
		preOrderRecursive(root.right);
		show(output);
	}
	
	public void preOrderIterative(Node root) {
		List<Integer> output = new ArrayList<>();
		Stack<Node> stack = new Stack<Node>();
		while(!stack.isEmpty() || root != null) {
			while(root != null) {
				output.add(root.data);
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			root = root.right;
		}
		show(output);
	}
	
	public void preOrderIterative2(Node root) {
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while(!stack.isEmpty()) {
			root = stack.pop();
			System.out.println(root.data);
			if(root.right != null) {
				stack.push(root.right);
			}
			if(root.left != null) {
				stack.push(root.left);
			}
		}
	}
	
	//INORDER recursive traversal
	//1. left
	//2. node
	//3. right	
	public void inOrderRecursive(Node root) {
		if(root == null)return; 
		
		inOrderRecursive(root.left);
		System.out.println(root.data);
		inOrderRecursive(root.right);
	}
	
	public void inOrderIterative(Node root) {
		Stack<Node> stack = new Stack<Node>();
		while(!stack.isEmpty() || root != null) {
			while(root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			System.out.println(root.data);
			root = root.right;
		}
	}

	//POSTORDER recursive traversal
	//1. left
	//2. right
	//3. node
	public void postOrderRecursive(Node root) {
		if(root == null)return; 
		
		postOrderRecursive(root.left);
		postOrderRecursive(root.right);
		System.out.println(root.data);
	}
	
	//PRE ORDER is node-->left-->right
	//use PRE ORDER code and modify to node-->right-->left
	//and reverse it to become node<--right<--left which is same as left-->right-->node
	public void postOrderIterative(Node root) {
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while(!stack.isEmpty()) {
			root = stack.pop();
			System.out.println(root.data);
			if(root.left != null) {
				stack.push(root.left);
			}
			if(root.right != null) {
				stack.push(root.right);
			}
		}
	}
	
	public void postOrderIterative2(Node root) {
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		s1.push(root);
		
		while(!s1.isEmpty()) {
			root = s1.pop();
			s2.push(root);
			if(root.left != null) {
				s1.push(root.left);
			}
			if(root.right != null) {
				s1.push(root.right);
			}
		}
		
		while(!s2.isEmpty()) {
			root = s2.pop();
			System.out.println(root.data);
		}
		
	}
	
	public void show(List<Integer> output) {
		ListIterator<Integer> itr = output.listIterator();
		System.out.print("List : ");
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
	}
	
	// LEVEL ORDER TRAVERSAL
	// USE QUEUE 
	
	public void levelOrderTraversal(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			int level_size = queue.size();
			for(int i = 0; i < level_size; i++) {
				Node curr = queue.poll();
				System.out.print(curr.data);
				if(curr.left !=null) {
					queue.offer(curr.left);
				}
				if(curr.right != null) {
					queue.offer(curr.right);
				}
				
			}System.out.println();

		}
	}

}
