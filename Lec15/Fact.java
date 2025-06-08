package Lec15;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(Fac(n));
	}

	public static int Fac(int n) {
		if (n == 0) {
			return 1;
		}
		int f1 = Fac(n - 1);// recursive call
		return f1 * n;
	}
}
