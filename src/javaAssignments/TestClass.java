package javaAssignments;

interface Int1
{
final int a=10;
void display();
}
class TestClass implements Int1
{
public void display()
{
	System.out.println("hello");
}

	public static void main(String[]args)
	{
	TestClass t=new TestClass();
	t.display();
	System.out.println(a);
}
}
