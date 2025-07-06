package Lec23;

//import java.lang.*;
public class Person {
	private String name = "Kaju";
	private int age = 20;

	public Person() {
		// TODO Auto-generated constructor stub
	}
//
//	public Person(String name) {
//		// TODO Auto-generated constructor stub
//	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}
//	public void setName(String name) {
//		this.name=name;
//		
//	}
//	public String getName() {
//	return name;
//		
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
		if (age < 0) {
			throw new Exception("Bklol age -ve nhi hoga");

		}
		this.age = age;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finaly blocks");
		}
	}
//	public void setAge(int age)throws Exception {
//		if (age < 0) {
//			throw new Exception("Bklol age -ve nhi hoga");
//			
//		}
//		this.age = age;
//	}
}
