package Lec9;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 3 };
	}

	public static int moore_Votig(int[] arr) {
		int e = arr[0];
		int vote = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == e) {
				vote++;
			} else {
				vote--;
				if (vote == 0) {
					e = arr[i];
					vote = 1;
				}
			}

		}
		return e;
	}

}
