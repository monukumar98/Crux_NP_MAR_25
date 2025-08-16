package Lec31;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}

	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = Create_Tree();
	}

	private Node Create_Tree() {
		// TODO Auto-generated method stub
		int val = sc.nextInt();
		Node nn = new Node(val);
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = Create_Tree();

		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = Create_Tree();

		}
		return nn;
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node node) {
		if (node == null) {
			return;
		}
		String s = "<--" + node.val + "-->";
		if (node.left != null) {
			s = node.left.val + s;
		} else {
			s = "." + s;
		}
		if (node.right != null) {
			s = s + node.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(node.left);
		Display(node.right);
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {

		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int left = max(nn.left);
		int right = max(nn.right);
		return Math.max(nn.val, Math.max(left, right));

	}

	public boolean find(int item) {

		return find(root, item);
	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null) {
			return false;
		}
		if (node.val == item) {
			return true;
		}
		boolean left = find(node.left, item);
		boolean right = find(node.right, item);
		return left || right;
	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {
		if (node == null) {
			return 0;
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;

	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node nn) {
		if (nn == null) {
			return;
		}

	}

	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}

	private void PostOrder(Node nn) {
		if (nn == null) {
			return;
		}
		PostOrder(nn.left);
		PostOrder(nn.right);
		System.out.print(nn.val + " ");

	}

	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}

	private void INOrder(Node nn) {
		if (nn == null) {
			return;
		}
		INOrder(nn.left);
		System.out.print(nn.val + " ");
		INOrder(nn.right);

	}
	public void levelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node r=q.poll();
			System.out.print(r.val+" ");
			if(r.left!=null) {
				q.add(r.left);
			}
			if(r.right!=null) {
				q.add(r.right);
			}
		}
		System.out.println();
	}

}












