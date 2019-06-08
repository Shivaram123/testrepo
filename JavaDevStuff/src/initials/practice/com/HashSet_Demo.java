package initials.practice.com;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {

	public static void main(String[] args) {
		
		HashSet<String> hashNames = new HashSet<String>();
		hashNames.add("Shiva");
		hashNames.add("gg");
		hashNames.add("jj");
		hashNames.add("hh");
		
		Iterator<String> li = hashNames.iterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
		try {
			int a = 100/0;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}finally {
			System.out.println("\n ************* block");
			System.out.println("finally block");
			System.out.println("finally block");
			System.out.println("finally block");
			System.out.println("finally block");
			System.out.println("finally block");
			System.out.println("finally block");
			try {
				int b = 100/0;
				
			}catch (Exception e1) {
				System.out.println(e1);
			}
		}
		System.out.println("after finally");	
		
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("dddd");
		hs.add("ddd");
		
		Iterator<String> ihs = hs.iterator();
		while(ihs.hasNext())
		{
			System.out.println(ihs.next());
		}
		
	}

}
