package Lec34;

public class Abstract_Demo_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Abstract_Demo ab = new Abstract_Demo();
//		ab.Payment();
		Abstract_Demo2 ab1 = new Abstract_Demo2();
		ab1.get();
		ab1.fun();
		ab1.Payment();
		Abstract_Demo ab2 = new Abstract_Demo2();
		Abstract_Demo ab = new Abstract_Demo() {

			@Override
			public boolean Payment() {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
	}

}
