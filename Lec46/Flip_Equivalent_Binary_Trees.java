package Lec46;

public class Flip_Equivalent_Binary_Trees {
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
		public boolean flipEquiv(TreeNode root1, TreeNode root2) {
			return Equiv(root1, root2);
		}

		public boolean Equiv(TreeNode root1, TreeNode root2) {
			if (root1 == null && root2 == null) {
				return true;
			}
			if (root1 == null || root2 == null) {
				return false;
			}
			if (root1.val != root2.val) {
				return false;
			}

			boolean flip = Equiv(root1.left, root2.right) && Equiv(root1.right, root2.left);
			boolean noflip = Equiv(root1.left, root2.left) && Equiv(root1.right, root2.right);
			return flip || noflip;
		}
	}

}
