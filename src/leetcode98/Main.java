package leetcode98;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {	
		BinarySearchTree tree = new BinarySearchTree();
		
		int[] input = {5,1,4};
		
		System.out.println("Input: " + Arrays.toString(input));
		
		tree.addTreeNode(input);
	
		System.out.println("Solution: " + tree.isValidBST(tree.root));
		
	}
}
