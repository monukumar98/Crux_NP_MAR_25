package Lec27;

import java.util.Deque;
import java.util.LinkedList;

public class Sliding_Window_Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
	}

	public static int[] Window_Maximum(int[] arr, int k) {
		Deque<Integer> q = new LinkedList<>();
		int[] ans = new int[arr.length - k + 1];
		// 1st window
		for (int i = 0; i < k; i++) {
			while (!q.isEmpty() && arr[q.getLast()] < arr[i]) {
				q.removeLast();
			}
			q.add(i);
		}
		int j = 0;// ans wala array ka index track
		ans[j++] = arr[q.getFirst()];
		for (int i = k; i < arr.length; i++) {
			// grow
			while (!q.isEmpty() && arr[q.getLast()] < arr[i]) {
				q.removeLast();
			}
			q.add(i);
			// shrink
			if (q.getFirst() == i - k) {
				q.removeFirst();
			}
			// ans calculate
			ans[j++] = arr[q.getFirst()];
		}
		return ans;
	}
}
