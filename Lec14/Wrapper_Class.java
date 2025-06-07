package Lec14;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer a1 = 12;
		System.out.println(a);
		System.out.println(a1);

		a1 = a;// auto-Boxing
		Integer a2 = 9;
		int b = a2;// un-Boxing
		long b1 = a2;
		Long a3 = 99l;
		
		Integer c1=71;
		Integer c2=71;
		Integer c4=171;
		Integer c3=171;
		System.out.println(c1==c2);
		System.out.println(c4==c3);
		Boolean d1=false;
		Boolean d2=false;
		System.out.println(d1==d2);
		Character e1='z';
		Character e2='z';	
		System.out.println(e1==e2);
		
	}

}
