package com.huidos22.algoritmos;

public class InvertBinaryTree {
	   public static TreeNode invertTree(TreeNode root) {
	        if (root == null) return null;

	        // Swap children
	        TreeNode temp = root.left;
	        root.left = root.right;
	        root.right = temp;

	        // Recursively invert children
	        invertTree(root.left);
	        invertTree(root.right);

	        return root;
	    }

	    // Helper method to print the tree in-order
	    public static void printInOrder(TreeNode node) {
	        if (node == null) return;
	        printInOrder(node.left);
	        System.out.print(node.val + " ");
	        printInOrder(node.right);
	    }

	    public static void main(String[] args) {
	        /*
	               4
	             /   \
	            2     7
	           / \   / \
	          1   3 6   9
	        */

	        TreeNode root = new TreeNode(4);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(7);
	        root.left.left = new TreeNode(1);
	        root.left.right = new TreeNode(3);
	        root.right.left = new TreeNode(6);
	        root.right.right = new TreeNode(9);

	        System.out.println("Before inversion:");
	        printInOrder(root);

	        invertTree(root);

	        System.out.println("\nAfter inversion:");
	        printInOrder(root);
	    }
}
//Definition for a binary tree node.
class TreeNode {
 int val;
 TreeNode left;
 TreeNode right;

 TreeNode(int val) {
     this.val = val;
 }
}