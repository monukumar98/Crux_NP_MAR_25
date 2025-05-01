package Lec5;

import java.util.Scanner;

public class Data_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = (byte) (428);
		short s = 5;
		int i = 5;
		long l = 4567890989l;
		byte b1 = (byte) (300);
		System.out.println(b);
		System.out.println(b1);
		b = 5;
		// b = (byte) (i);
		i = b;
		Scanner sc = new Scanner(System.in);
		b=sc.nextByte();
		s=sc.nextShort();
		i=sc.nextInt();
		l=sc.nextLong();
	}

}









