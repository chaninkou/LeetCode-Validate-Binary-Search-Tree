package leetcode98;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree {
	TreeNode root;
	
	public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        
        // Our previous should not be bigger than current
        TreeNode prev = null;
        
        // Inorder
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.add(root);
                root = root.left;
            }
            
            root = stack.pop();
            
            // Since inorder should be non decreasing value
            if(prev != null && root.val <= prev.val){
                return false;
            }
            
            prev = root;
            
            root = root.right;
            
        }
        
        return true;
    }

	public void addTreeNode(int[] values) {
		TreeNode nodeToAdd;
		
		for(int value : values){
			nodeToAdd= new TreeNode(value);
			
			if(root == null){
				root = nodeToAdd;
			}
			
			traverseAndAddNode(root, nodeToAdd);
		}

	}
	
	public void traverseAndAddNode(TreeNode root, TreeNode nodeToAdd){		
		if(nodeToAdd.val < root.val){
			if(root.left == null){
				root.left = nodeToAdd;
			} else {
				traverseAndAddNode(root.left,nodeToAdd);
			}
		} else if (nodeToAdd.val > root.val){
			if(root.right == null){
				root.right = nodeToAdd;
			} else {
				traverseAndAddNode(root.right, nodeToAdd);
			}
		}
	}

}
