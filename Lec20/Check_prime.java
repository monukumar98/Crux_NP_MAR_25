package Lec20;

public class Check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=781;
		System.out.println(isprime(n));

	}
	public static boolean isprime(int n) {
		int div=2;
		while(div*div<=n) {
			if(n%div==0) {
				return false;
			}
			div++;
		}
		return true;
	}

}
