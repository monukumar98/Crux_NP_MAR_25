package Lec20;

public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 121;
		System.out.println(Prime_Sieve(n));

	}

	public static int Prime_Sieve(int n) {
		if (n < 2) {
			return 0;
		}
		int[] prime = new int[n];
		prime[0] = 1;// not prime
		prime[1] = 1;// not prime;
		for (int i = 0; i * i < prime.length; i++) {
			if (prime[i] == 0) {
				for (int j = 2; i * j < prime.length; j++) {
					prime[i * j] = 1;
				}
			}

		}
		int c = 0;
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == 0) {
				c++;
			}
		}
		return c;
	}

}
