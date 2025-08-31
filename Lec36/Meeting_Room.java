package Lec36;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Meeting_Room {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = { { 9, 30 }, { 5, 10 }, { 15, 20 }, { 6, 9 }, { 2, 6 }, { 3, 5 } };
//		Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
//		for (int i = 0; i < intervals.length; i++) {
//			for (int j = 0; j < intervals[0].length; j++) {
//				System.out.print(intervals[i][j] + " ");
//			}
//			System.out.println();
//		}

	}

	public static int miRooms(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[1] - b[1]));
		pq.add(intervals[0]);
		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i][0] >= pq.peek()[1]) {
				pq.poll();

			}
			pq.add(intervals[i]);
		}
		return pq.size();
	}
}








