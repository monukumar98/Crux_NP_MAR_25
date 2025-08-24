package Lec34;

public class Generics_Desmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 2, 4, 5, 6 };
		Display(arr);
		String[] arr1 = { "Raj", "Ankit", "Ankita", "Anku" };
		Display(arr1);
		System.out.println(get(arr1));
	}

	public static <T>void Display(T[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	public static <T>T get(T[] arr) {
		// TODO Auto-generated method stub
		return arr[0];
		
	}

}
