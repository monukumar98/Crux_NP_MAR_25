package Lec31;

public class BinaryTreeClient {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.Display();
		System.out.println(bt.max());
		System.out.println(bt.find(11));
		System.out.println(bt.ht());
		bt.PreOrder();
		bt.PostOrder();
		bt.INOrder();
		bt.levelOrder();
	}

}
