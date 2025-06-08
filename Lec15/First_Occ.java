package Lec15;

public class First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 6, 5, 4, 7, 4 };
		int item = 4;
		System.out.println(index(arr, item, 0));

	}

	public static int index(int[] arr, int item, int i) {
		if (i == arr.length) {
			return -1;
		}
		if (arr[i] == item) {
			return i;
		}
		return index(arr, item, i + 1);
	}

}
