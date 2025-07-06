package Lec23;

public class PersonClient {

	public static void main(String[] args) {//throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		Person p = new Person("Raju", 27);
//		p.name = "Rajuu";
//		p.age = -90;
		p.setAge(-90);
		System.out.println(p.getName()+" "+p.getAge());
	}

}
