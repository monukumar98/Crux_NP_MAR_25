package Lec37;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();//
		System.out.println(sb.capacity());
		sb.append("abc");
		sb.append(1);
		sb.append(true);
		sb.append('a');
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.charAt(2));
		System.out.println(sb.substring(1, 3));
		System.out.println(sb.replace(1, 1, "e"));
		// sb=sb.reverse();
		System.out.println(sb.reverse());
		String s = sb.toString();

	}

}
