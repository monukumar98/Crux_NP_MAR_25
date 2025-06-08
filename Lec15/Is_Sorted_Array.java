package Lec15;

public class Is_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 7, 8 };
		System.out.println(issorted(arr, 0));

	}

	public static boolean issorted(int[] arr, int i) {
		if (arr.length - 1 == i) {
			return true;
		}
		if (arr[i] > arr[i + 1]) {
			return false;
		}
		return issorted(arr, i + 1);

	}
}
