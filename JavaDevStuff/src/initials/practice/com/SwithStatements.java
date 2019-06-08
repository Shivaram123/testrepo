package initials.practice.com;

import java.util.Scanner;

public class SwithStatements {
	
	public static void main(String a[])
	{
		System.out.println("Enter the age");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		switch(age)
		{
		case 10 :
			System.out.println(age);
		case 20 :
			System.out.println(age);
		default:
			System.out.println(age);
			
		}
	}

}
