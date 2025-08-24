package Lec34;

public class LinkedList<T> {
	private class Node {
		T val;
		Node next;

		public Node(T val) {
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
	public void addfirst(T item) {
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
	public void addlast(T item) {
		if (size == 0) {
			addfirst(item);
		} else {
			Node nn = new Node(item);
			tail.next = nn;
			tail = nn;
			size++;

		}
	}

	public void addatindex(T item, int k) {
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

	public T getfirst() {
		return head.val;

	}

	public T getlast() {
		return tail.val;

	}

	public T getatindex(int k) {
		return getNode(k).val;

	}

	// O(1)
	public T removefirst() {
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
	public T removelast() {
		if (size == 1) {
			return removefirst();
		} else {
			T val = tail.val;
			Node prev = getNode(size - 2);
			tail = prev;
			tail.next = null;
			size--;
			return val;

		}
	}

	public T removeatindex(int k) {
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node prev = getNode(k - 1);
			Node curr = prev.next;
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}
	}
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.addlast("Raj");
		ll.addlast("kaju");
		ll.addlast("ankita");
		ll.addlast("ankit");
		ll.Display();
	}

}











