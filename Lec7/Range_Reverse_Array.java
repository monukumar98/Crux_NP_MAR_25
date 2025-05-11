package Lec7;

public class Range_Reverse_Array {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 7, 9, 1, 45, 7, 11 };
		Reverse(arr, 2, 6);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

}
