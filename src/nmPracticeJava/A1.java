package nmPracticeJava;

class A1  //Hybrid inheritance
{
	void m1()
	{
		System.out.println("This is m1 method from A1 class");
	}
}

interface B1
{
	void m2();
}

interface C1
{
	void m3();
}

public class HybridInheritance extends A1 implements B1,C1
{

	public void m2()
	{
		System.out.println("This is m2 method from B1 interface");
	}
	
	public void m3()
	{
		System.out.println("This is m3 method from C1 interface");
	}
	
	
	public static void main(String[] args) {
		
		HybridInheritance hi=new HybridInheritance();
		hi.m1();
		hi.m2();
		hi.m3();
}}