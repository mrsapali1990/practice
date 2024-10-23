package nmPracticeJava;

public class Inheritance {
	String designation="Teacher";
	String collegeName="NBN";
	void does()
	{
		System.out.println("Teaching");
	}
}
class Child extends Inheritance{
	String mianSubject="Fluid";
	public static void main(String[] args) {

		Child c=new Child();
		System.out.println(c.designation);
		System.out.println(c.collegeName);
		System.out.println(c.mianSubject);
		c.does();
	}
}