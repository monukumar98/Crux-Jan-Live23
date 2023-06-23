package Lec48;


public class Validate_Bst {

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
		public boolean isValidBST(TreeNode root) {
			return validbst(root).isbst;
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

			return sbstp;

		}
	}

	class BstPair {
		boolean isbst = true;
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;

	}

}
