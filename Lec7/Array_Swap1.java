package Lec7;

public class Array_Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 4, 9, 7 };
//		int[] arr = new int[] { 10, 20, 4, 9, 7 };
		System.out.println(arr[0] + " " + arr[1]);//10 20
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);// ??
	}

	public static void Swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;

	}
}
