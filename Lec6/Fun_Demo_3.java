package Lec6;

public class Fun_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 9;
		int b = 11;
		System.out.println(Addition(b, a));
		System.out.println("Bye");

	}

	public static int Addition(int a, int b) {

		int c = a + b;
		return c + sub(c, a);

	}

	public static int sub(int a, int b) {

		int c = a - b;
		return c;

	}

}
