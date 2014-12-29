/**
 * Problem: Find min depth of a binary tree
 *
 * Solution: use helper function to return MAX_VALUE if node is null
 */

public class MinDepthBinaryTree{
	public int minDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		return minDepthHelper(root);
	}

	public int minDepthHelper(TreeNode root){
		//if a child is null, assign max_value to ignore it
		if(root == null){
			return Integer.MAX_VALUE;
		}
		//leaf
		if(root.left==null && root.right==null){
			return 1;
		}
		return 1+Math.min(minDepthHelper(root.left),minDepthHelper(root.right));
	}
}