package Lec11;

public class Search_in_Rotated_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int item = 0;
	}

	public static int Search(int[] arr, int item) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] >= arr[lo]) {// uppar line pe mid hai
                if(arr[lo]<=item && item<arr[mid]) {
                	hi=mid-1;
                }
                else {
                	lo=mid+1;
                }
                	
			} 
			else {// lower line pe mid hai
				if(arr[hi]>=item && item>arr[mid]) {
					lo=mid+1;
				}
				else {
					hi=mid-1;
				}
			}
		}
		return -1;
	}

}
