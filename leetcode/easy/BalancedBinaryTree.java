/**
 * Problem: Given a binary tree, determine if it is height-balanced.
 *
 * Solution: recursively check on subtrees
 */
public class BalancedBinaryTree{
	public boolean isBalanced(TreeNode root){
		if(root == null){
			return true;
		}
		if(Math.abs(height(root.left)-height(root.right))>1){
			return false;
		}else{
			return isBalanced(root.left) && isBalanced(root.right);
		}
	}

	public int height(TreeNode node){
		if(node == null){
			return -1;
		}
		return 1 + Math.max(height(node.left),height(node.right));
	}
}