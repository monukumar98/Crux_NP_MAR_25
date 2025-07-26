package Lec26;

import Lec24.Stack;

public class DynamicStack extends Stack {
	@Override
	public void push(int item) throws Exception {
		if (isfull()) {
			int[] new_arr = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				new_arr[i] = arr[i];
			}
			arr = new_arr;

		}
		super.push(item);

	}

	public static void main(String[] args) throws Exception {
		DynamicStack ds = new DynamicStack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(40);
		ds.push(50);
		ds.push(60);
		ds.push(70);
		ds.push(80);
		System.out.println(ds.peek());
		System.out.println(ds.pop());
		ds.Display();
	}

}
