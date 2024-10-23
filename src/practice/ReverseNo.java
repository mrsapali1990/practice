package practice;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		//scanner class in java that can accsept data at run time
				Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the value:");
				int num=sc.nextInt();
				int rev=0;
				while(num!=0)
				{
					rev=rev*10+num%10;
					num=num/10;
				}
				System.out.println("Reverse number is:"+rev);
						

			}
}
