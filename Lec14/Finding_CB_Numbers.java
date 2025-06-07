package Lec14;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void printallSubString(String s) {
		int c = 0;
		boolean[] visited = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				String s1 = s.substring(i, j);// char i to j-1
				if (IscbNumber(Long.parseLong(s1)) == true && isvisited(visited, i, j) == true) {
					c++;
					for (int k = i; k < j; k++) {// marked kra
						visited[k] = true;
					}
				}
			}
		}
		System.out.println(c);
	}

// true kb dega,  jb i to j-1 tk ka saara cell false fill hoga tb true mana jaayega iska mtlb  pehle se cb number nhi banaya hai 
	public static boolean isvisited(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub
		for (int k = i; k < j; k++) {
			if (visited[k] == true) {
				return false;
			}
		}
		return true;
	}

	public static boolean IscbNumber(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
			if (num % arr[i] == 0) {
				return false;
			}
		}
//		for (int i = 0; i < arr.length; i++) {
//			
//		}
		return true;

	}

}
