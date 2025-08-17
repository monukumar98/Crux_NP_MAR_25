package Lec32;

public class Path_Sum {
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
		public boolean hasPathSum(TreeNode root, int targetSum) {
			return PathSum(root, targetSum);
		}

		public boolean PathSum(TreeNode root, int targetSum) {
			if (root == null) {
				return false;
			}
			if (root.left == null && root.right == null) {
				return targetSum - root.val == 0;
			}

			boolean left = PathSum(root.left, targetSum - root.val);
			boolean right = PathSum(root.right, targetSum - root.val);
			return left || right;

		}
	}
}
