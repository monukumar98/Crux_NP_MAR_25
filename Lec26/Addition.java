package Lec26;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2, 7));
		System.out.println(add(2, 7, 11));
		System.out.println(add(2, 7, 9l));
		System.out.println(add(2, 7.9f, 6));
		System.out.println(add(2, 7, 3, 1, 2, 2, 2, 1, 1, 1, 1, 1, 2, 11, 3, 3, 3, 4));

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, int b, long c) {
		return (int) (a + b + c);
	}

	public static int add(int a, float b, long c) {
		return (int) (a + b + c);
	}

	public static int add(int x, int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}










