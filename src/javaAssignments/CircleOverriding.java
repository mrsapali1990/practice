package javaAssignments;
class AreaCirRec{


	public static void main(String args[]) 
	{
		CircleOverriding ob = new overRidingChild();
		ob.area(11);
		ob.area(2);
	}

}

public class CircleOverriding {
	public void area(int x)
	{
		int y=12;
		System.out.println("the area of the rectangle is "+x*y+" sq units");
	}

}

class overRidingChild extends CircleOverriding
{
	public void area(int x)
	{
		double z = 3.14 * x * x;
		System.out.println("the area of the circle is "+z+" sq units");
	}
}

