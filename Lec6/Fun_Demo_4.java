package Lec6;

public class Fun_Demo_4 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 9;
		int b = 11;
		System.out.println(val);// 100
		System.out.println(Addition(b, a));// 29
		System.out.println(val);// ?
		System.out.println("Bye");

	}

	public static int Addition(int a, int b) {

		int c = a + b;
		int val = 70;
		Fun_Demo_4.val = Fun_Demo_4.val - 1;
	//	System.out.println("hs"+val);
		return c + sub(c, a);

	}

	public static int sub(int a, int b) {

		int c = a - b;
		return c;

	}
}
