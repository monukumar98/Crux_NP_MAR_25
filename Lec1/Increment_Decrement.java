package Lec1;

public class Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
//		x++;// x = x + 1; Post Increment
//		++x; // x = x+ 1; Pre Increment
//		x--;// x = x- 1; Post Decrement
//		--x;// x= x-1; Pre Decrement
//		System.out.println(x++);//9
//		System.out.println(x);//10
//		System.out.println(--x);//8
//		System.out.println(x);//8
//		int c = x++ + 7 + --x + x--;//34
//		int c = x++ + --x + --x - x-- - ++x - --x;//3
		int c = x++ + ++x - --x + --x + x++;
		System.out.println(c);

	}

}
