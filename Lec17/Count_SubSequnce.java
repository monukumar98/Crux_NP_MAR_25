package Lec17;

public class Count_SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
//		Print(ques, "");
//	//	System.out.println();
//		System.out.println("\n"+val);
		System.out.println("\n"+Count(ques, ""));

	}

	public static int Count(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		char ch = ques.charAt(0);
		int x=Count(ques.substring(1), ans);// NO
		int y= Count(ques.substring(1), ans + ch);// Yes
		return x+y;

	}

//	static int val = 0;
//
//	public static void Print(String ques, String ans) {
//		if (ques.length() == 0) {
//			System.out.print(ans+" ");
//			val++;
//			return;
//		}
//		char ch = ques.charAt(0);
//		Print(ques.substring(1), ans);// NO
//		Print(ques.substring(1), ans + ch);// Yes
//
//	}
}
