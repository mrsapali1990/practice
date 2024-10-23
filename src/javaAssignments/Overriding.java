package javaAssignments;

class Circle {
	 void area(int x)
	{
		int y=12;
		System.out.println("the area of the rectangle is "+x*y+" sq units");
	}

}

class overRidingChild1 extends Circle
{
	 void area(int x)
	{
		double z = 3.14 * x * x;
		System.out.println("the area of the circle is "+z+" sq units");
	}
}

 class Overriding{


	public static void main(String args[]) 
	{
		overRidingChild1 ob = new overRidingChild1();
		ob.area(11);
		ob.area(2);
	}

}
