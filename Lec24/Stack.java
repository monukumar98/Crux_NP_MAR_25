package Lec24;

public class Stack {
	protected int[] arr;
	private int idx = -1;

	public Stack() {
		// TODO Auto-generated constructor stub
		this(5);
	}

	public Stack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
	}

	// O(1)
	public boolean isEmpty() {
		return idx == -1;
	}

	// O(1)
	public boolean isfull() {
		return size() == arr.length;
	}

	// O(1)
	public void push(int item) throws Exception {
		if(isfull()) {
			throw new Exception("Bklol stack full hai");
		}
		arr[++idx] = item;
	}

	// O(1)
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Bklol stack Empty hai");
		}
		int x = arr[idx];
		idx--;
		return x;
	}

	// O(1)
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Bklol stack Empty hai");
		}
		return arr[idx];

	}

	// O(1)
	public int size() {
		return idx + 1;
	}

	public void Display() {
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}








