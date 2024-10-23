package javaAssignments;

//Using toCharArray() Method

public class StringToCharArray {

	public static void main(String args[])
	{
		String str = "MallikarjunSapali";

		// returned by toCharArray() method
		char[] ch = str.toCharArray();

		for (char c : ch) {

			System.out.println(c);
		}
	}
}