package Lec32;

public class Diameter_of_Binary_Tree2 {
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
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root).ld;

		}

		public DiaPair diameter(TreeNode root) {
			if (root == null) {
				return new DiaPair();
			}
			DiaPair ldp = diameter(root.left);// ld, hi
			DiaPair rdp = diameter(root.right);// ld, hi
			int sd = ldp.hi + rdp.hi + 2;
			DiaPair sdp = new DiaPair();
			sdp.hi = Math.max(ldp.hi, rdp.hi) + 1;
			sdp.ld = Math.max(sd, Math.max(ldp.ld, rdp.ld));
			return sdp;
		}
	}

}

class DiaPair {
	int ld = 0;
	int hi = -1;
}












