package Lec7;

public class Maximum_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 7, 9, 1, 45, 7 };
		System.out.println(Maximum(arr));
	}
	public static int Maximum1(int[] arr) {
		//-2^31
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max=Math.max(arr[i], max);
		}
		return max;
	}
	public static int Maximum(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
