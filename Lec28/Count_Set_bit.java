package Lec28;

public class Count_Set_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		System.out.println(Set_bit(n));
		System.out.println(Fast_Set_bit(n));
	}

	public static int Fast_Set_bit(int n) {
		int c = 0;
		while (n > 0) {
			c++;
			n = (n & (n - 1));
		}
		return c;
	}

	public static int Set_bit(int n) {
		int c = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				c++;
			}
			n >>= 1;// n = n>> 1;
		}
		return c;
	}
}
