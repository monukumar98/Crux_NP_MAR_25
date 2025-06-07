package Lec14;
public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean IscbNumber(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if(num==arr[i]) {
				return true;
			}
			if(num%arr[i]==0) {
				return false;
			}
		}
//		for (int i = 0; i < arr.length; i++) {
//			
//		}
		return true;

		
	}

}
