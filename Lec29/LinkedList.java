package Lec29;

public class LinkedList {
	private class Node {
		int val;
		Node next;

		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}
	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public int size() {
		return size;
	}

	// O(1)
	public void addfirst(int item) {
		Node nn = new Node(item);
		// nn.val=item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

	// O(1)
	public void addlast(int item) {
		if (size == 0) {
			addfirst(item);
		} else {
			Node nn = new Node(item);
			tail.next = nn;
			tail = nn;
			size++;

		}
	}

	public void addatindex(int item, int k) {
		if (k == 0) {
			addfirst(item);
		} else if (k == size) {
			addlast(item);
		} else {
			Node nn = new Node(item);
			Node prev = getNode(k - 1);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}

	}

	// O(N)
	private Node getNode(int k) {
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	public int getfirst() {
		return head.val;

	}

	public int getlast() {
		return tail.val;

	}

	public int getatindex(int k) {
		return getNode(k).val;

	}

	// O(1)
	public int removefirst() {
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head = head.next;
			temp.next = null;
			size--;
		}
		return temp.val;
	}
// O(N)
	public int removelast() {
		if (size == 1) {
			return removefirst();
		} else {
			int val = tail.val;
			Node prev = getNode(size - 2);
			tail = prev;
			tail.next = null;
			size--;
			return val;

		}
	}
	public int removeatindex(int k) {
		if(k==0) {
			return removefirst();
		}
		else if(k==size-1) {
			return removelast();
		}
		else {
			Node prev=getNode(k-1);
			Node curr=prev.next;
			prev.next=curr.next;
			curr.next=null;
			size--;
			return curr.val;
		}
	}

}











