package Lec46;


public class Balanced_Binary_Tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public boolean isBalanced(TreeNode root) {
			return Balanced(root);

		}

		public boolean Balanced(TreeNode root) {
			if (root == null) {
				return true;
			}

			boolean left = Balanced(root.left);
			boolean right = Balanced(root.right);
			boolean sb = Math.abs(ht(root.left) - ht(root.right)) <= 1;
			return left && right && sb;

		}

		public int ht(TreeNode root) {
			if (root == null) {
				return -1;
			}
			int lh = ht(root.left);
			int rh = ht(root.right);
			return Math.max(lh, rh) + 1;

		}
	}
}
