package Lec27;

public class Maximum_Sum_Of_Window_Size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 4, 5, 7, 2, 3 };
		int k = 3;
		System.out.println(Maximum_Sum(arr, k));

	}

	public static int Maximum_Sum(int[] arr, int k) {
		// 1st window
		int ans = 0, sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		ans = sum;
		for (int i = k; i < arr.length; i++) {
			// grow
			sum += arr[i];
			// shrink
			sum -= arr[i-k];
			// ans calculate
			ans=Math.max(ans, sum);
		}
		return ans;
	}
}











