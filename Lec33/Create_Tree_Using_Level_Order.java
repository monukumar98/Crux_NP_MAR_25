package Lec33;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Tree_Using_Level_Order {

	class Node {
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

	public Create_Tree_Using_Level_Order() {
		// TODO Auto-generated constructor stub
		createTree();
	}

	private void createTree() {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<>();
		int item=sc.nextInt();
		Node nn = new Node(item);
		root=nn;
		q.add(nn);
		while(!q.isEmpty()) {
			Node r=q.poll();
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			if(c1!=-1) {
				Node node = new Node(c1);
				r.left=node;
				q.add(node);
			}
			if(c2!=-1) {
				Node node = new Node(c2);
				r.right=node;
				q.add(node);
			}
		}

	}
}




















