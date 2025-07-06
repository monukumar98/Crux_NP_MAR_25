package Lec23;

import java.util.ArrayList;

public class StudentClient {
	public static void main(String[] args) {
		ArrayList<Integer> ll = new ArrayList<>();
		ArrayList<Integer> ll1 = new ArrayList<>();
		ll.add(10);
		System.out.println(ll);
		Student s1 = new Student();
		s1.name = "Kaju";
		s1.age = 19;
		Student s2 = new Student();
		s2.name = "Raju";
		s2.age = 45;
		s1.Intro_yourSelf();
		s2.Intro_yourSelf();
		s1.SayHey("Raj");
		Student.MentorName(s1);

	}
	static {
		System.out.println("StudentClient Static block1");
	}
}
