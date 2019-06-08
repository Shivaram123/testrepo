package initials.practice.com;

import java.util.Scanner;

public class Practice1_Inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age of the Employee:");
		int age = scan.nextInt();
		System.out.println("Age Entered is "+ age);
		
		System.out.println("Enter the name of the Employee:");
		String name = scan.nextLine();
		System.out.println("Name Entered is "+ name);

	}

}
