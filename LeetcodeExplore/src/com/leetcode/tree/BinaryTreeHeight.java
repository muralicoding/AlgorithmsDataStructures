package com.leetcode.tree;

public class BinaryTreeHeight {
	
	public Node root;
	
	
	
	
	
	
	public static int heightOfTree(Node root) {
		if(root == null)return 0;
		
		int left_height = heightOfTree(root.left);
		int right_height = heightOfTree(root.right);
		

		return Math.max(left_height, right_height) + 1;
	}
	
	
	
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
        
        tree.levelOrderTraversal(tree.root);
        
        

	}

}

