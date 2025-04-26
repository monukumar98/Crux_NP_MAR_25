package Lec4;

public class Print_Prime_factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 378;
		for (int i = 2; i <= n;) {
			if (n % i == 0) {
				System.out.println(i);
				n = n / i;
			} else {
				i++;
			}
		}

	}

}
