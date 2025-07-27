package Lec28;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		int mul = 5, ans = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				ans += mul;
			}
			mul = mul * 5;
			n >>= 1;
		}
		System.out.println(ans);
	}

}
