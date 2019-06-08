
package initials.practice.com;

import java.util.Scanner;

public class StringsPractice {

	public static void main(String a[])
	{
		System.out.println("Enter a String");
		Scanner scan = new Scanner(System.in);
		String myString = scan.nextLine();
		System.out.println(myString.length());
		System.out.println(myString.charAt(3));
		System.out.println(myString.substring(4));
		System.out.println(myString.endsWith("m"));
		System.out.println(myString.compareTo("shivaram"));
		System.out.println(myString.contains("Ram"));
		System.out.println(myString.replace("Ra", "Ba"));
		String arr[] = myString.split(" ");
		System.out.println(arr[0]);
		
	}
}
