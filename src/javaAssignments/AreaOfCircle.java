package javaAssignments;

public class AreaOfCircle {
	void area(int x, int y)
	{
		System.out.println("the area of the rectangle is "+x*y+" sq units");
	}
	void area(double x)
	{
		double z = 3.14 * x * x;
		System.out.println("the area of the circle is "+z+" sq units");
	}


	public static void main(String args[]) 
	{
		AreaOfCircle obj = new AreaOfCircle();
		obj.area(11,12);
		obj.area(2.5);
	}
}