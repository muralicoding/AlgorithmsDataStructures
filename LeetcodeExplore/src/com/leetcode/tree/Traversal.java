package com.leetcode.tree;

public class Traversal {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);	
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.right = new Node(8);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.right.right = new Node(9);
    
        
        //System.out.println("Pre Order Traversal Recursive");
        //tree.preOrderRecursive(tree.root);
        //System.out.println("Pre Order Traversal Iterative");
        //tree.preOrderIterative(tree.root);
        //System.out.println("Pre Order Traversal Iterative 2");
        //tree.preOrderIterative2(tree.root);
        //System.out.println("In Order Traversal Recursive");
        //tree.inOrderRecursive(tree.root);
        //System.out.println("In Order Traversal Iterative");
        //tree.inOrderIterative(tree.root);
        System.out.println("Post Order Traversal");
        tree.postOrderRecursive(tree.root);
        System.out.println("Post Order Traversal Iterative");
        tree.postOrderIterative2(tree.root);
	}

}
