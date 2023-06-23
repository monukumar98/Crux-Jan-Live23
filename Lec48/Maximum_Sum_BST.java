package Lec48;

import Lec48.Largest_BST_Subtree.BstPair;
import Lec48.Largest_BST_Subtree.TreeNode;

public class Maximum_Sum_BST {

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
		public int maxSumBST(TreeNode root) {
			return validbst(root).ans;
		}

		public BstPair validbst(TreeNode root) {
			if (root == null) {
				return new BstPair();
			}

			BstPair lbstp = validbst(root.left);
			BstPair rbstp = validbst(root.right);
			BstPair sbstp = new BstPair();
			sbstp.min = Math.min(root.val, Math.min(lbstp.min, rbstp.min));
			sbstp.max = Math.max(root.val, Math.max(lbstp.max, rbstp.max));
			sbstp.isbst = lbstp.isbst && rbstp.isbst && root.val > lbstp.max && root.val < rbstp.min;
			sbstp.sum = lbstp.sum + rbstp.sum + root.val;
			if (sbstp.isbst) {
				sbstp.ans = Math.max(sbstp.sum, Math.max(lbstp.ans, rbstp.ans));

			} else {
				sbstp.ans = Math.max(lbstp.ans, rbstp.ans);
			}
			return sbstp;

		}
	}

	class BstPair {
		boolean isbst = true;
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		int sum = 0;// saare node ka sum
		int ans = 0;// bst part ka sum 

	}

}
