package Lec48;

public class Construct_Binary_Tree_from_Preorder_and_Inorder {
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
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return CreateTree(preorder, inorder, 0, inorder.length - 1, 0, preorder.length - 1);
		}

		public TreeNode CreateTree(int[] pre, int[] in, int ilo, int ihi, int plo, int phi) {
			if (ilo > ihi || plo > phi) {
				return null;
			}
			TreeNode node = new TreeNode(pre[plo]);
			int idx = search(in, ilo, ihi, pre[plo]);
			int nel = idx - ilo;
			node.left = CreateTree(pre, in, ilo, idx - 1, plo + 1, plo + nel);
			node.right = CreateTree(pre, in, idx + 1, ihi, plo + nel + 1, phi);
			return node;

		}

		public int search(int[] in, int si, int ei, int item) {
			for (int i = si; i <= ei; i++) {
				if (in[i] == item) {
					return i;
				}
			}
			return 0;
		}
	}
}
