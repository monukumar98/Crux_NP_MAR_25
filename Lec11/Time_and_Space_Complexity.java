package Lec11;

public class Time_and_Space_Complexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 100000; i++) {
//
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		int n = 1000;
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(N)
			i++;
		}
		while (i < n) {
			System.out.println("Hey");
			// log(N) base 2
			i *= 2;
		}
		while (n > 0) {
			System.out.println("Hey");
			n /= 2;// log(N) base 2
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(N)
			i += 2;
			i += 3;
		}
		while (i <= n) {
			System.out.println("Hey");
			// log(N) base 6
			i *= 2;
			i *= 3;
		}
		while (n > 0) {
			System.out.println("Hey");
			// log(N) base 6
			n /= 2;
			n /= 3;
		}
		int k = 2;
		while (i <= n) {
			System.out.println("Hey");
			// Number of Steps N/k
			i += k;
		}
		while (i <= n) {
			System.out.println("Hey");
			// log(N) base k
			i *= k;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(N)
			n = n - 1;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(N)
			n = n - 2;
			n = n - 3;
		}
		while (n > 0) {
			n = n - k;
			// Number of Steps N/k
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("hey");
				// O(N^2)
			}
		}
		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
			// O(sqrt(N)
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for ( k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					//O(N^4)
				}
			}
		}
		for (i = 1; i <= n; i *= 2) {
			System.out.println("hey");
			// log(N) base 2
		}
		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for ( k = 1; k <= n; k = k * 2) {
					System.out.println("hey");
					//O(N^2log(N))
				}
			}
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				System.out.println("hey");
			}
		}
	}

}
















