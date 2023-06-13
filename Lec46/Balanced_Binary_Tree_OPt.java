package Lec46;

public class Balanced_Binary_Tree_OPt {
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
			return Balanced(root).isbal;

		}

		public BalancePair Balanced(TreeNode root) {
			if (root == null) {
				return new BalancePair();
			}
			BalancePair lbp = Balanced(root.left);
			BalancePair rbp = Balanced(root.right);
			BalancePair sbp = new BalancePair();
			sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;
			boolean sb = Math.abs(lbp.ht - rbp.ht) <= 1;
			sbp.isbal = lbp.isbal && rbp.isbal && sb;
			return sbp;

		}

		class BalancePair {
			boolean isbal = true;
			int ht = -1;
		}
	}
}
