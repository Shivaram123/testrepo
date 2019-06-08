package initials.practice.com;

import java.util.Scanner;
import java.util.stream.IntStream;

public class practice {

	public static void main(String[] args) {
		System.out.println("enter the list of numbers");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("FOR LOOP");
		for( int i=0; i<=num; i++)
		{
			System.out.println(i);
		}
		System.out.println("WHILE LOOP");
		int j=0;
		while(j<=num)
		{
			System.out.println(j);
			j++;
		}
		System.out.println("Recursive Function");
		practice.recursiveFun(num, 1);
		
		System.out.println("Intstream");
		IntStream.rangeClosed(1, num).forEach(System.out::println);
		
		scan.close();
		
	}
	public static void recursiveFun(int n,int a)
	{
		if(a<=n)
		{
			System.out.println(a);
			recursiveFun(n,++a);
		}
	}

}
