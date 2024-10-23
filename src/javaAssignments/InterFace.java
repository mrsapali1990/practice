package javaAssignments;

 interface In1 
 {
final int a=10;
void display();
}
class TestClass1 implements In1
{
public void display()
{
	System.out.println("hello");
}

	public static void main(String[]args)
	{
	TestClass1 t=new TestClass1();
	t.display();
	System.out.println(a);
}
}
