package Lec2;

public class Pattern1 {
	public static void main(String[] args) {
		int n = 5;
		int star = n;
		int row = 1;
		while (row <= n) {
			// star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}

			// Next Line ki prep
			System.out.println();
			row++;
			
		}

	}

}
