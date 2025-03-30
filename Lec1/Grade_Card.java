package Lec1;

public class Grade_Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=62;
		if(m>=75) {
			System.out.println("Grade A");
		}
		else if(m>=65 && m<75) {
			System.out.println("Grade B");
		}
		else if(m>=55 && m<65) {
			System.out.println("Grade C");
		}
		else if(m>=45 && m<55) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
