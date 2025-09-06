package Lec37;

public class String_VS_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTC();
	//	StringBuilderTC();

	}

	public static void StringBuilderTC() {
		StringBuilder sb = new StringBuilder();//
		for (int i = 0; i < 1000000; i++) {
			sb.append(i);

		}

	}

	public static void StringTC() {
		String s = "";
		for (int i = 0; i < 1000000; i++) {
			s = s + i;
		}
	}

}
