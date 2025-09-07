package Lec38;

import java.util.*;

import Lec38.Top_View.Pair;

public class Top_View {
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

		public List<Integer> TopView(TreeNode root) {
			Queue<Pair> q = new LinkedList<>();
			q.add(new Pair(root, 0));
			TreeMap<Integer, Integer> map = new TreeMap<>();
			while (!q.isEmpty()) {
				Pair p = q.poll();
				TreeNode node = p.nn;
				int vd = p.vd;
				if (!map.containsKey(vd)) {
					map.put(vd, node.val);
				}
				if (node.left != null) {
					q.add(new Pair(node.left, vd - 1));
				}
				if (node.right != null) {
					q.add(new Pair(node.right, vd + 1));
				}
			}
			List<Integer> ll = new ArrayList<>();
			for (int key : map.keySet()) {
				ll.add(map.get(key));
			}
			return ll;
		}
	}

	class Pair {
		TreeNode nn;
		int vd;

		public Pair(TreeNode nn, int vd) {
			// TODO Auto-generated constructor stub
			this.nn = nn;
			this.vd = vd;
		}
	}
}
