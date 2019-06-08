package initials.practice.com;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayLIst1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		
		ArrayList<Float> floatAL = new ArrayList<Float>();
		
		myArrayList.add(10);
		myArrayList.add(10);
		myArrayList.add(10);
		myArrayList.add(0, 0);
		myArrayList.add(0, 1);
		myArrayList.add(0, 2);
		
		System.out.println(myArrayList.get(0));
		for(int x:myArrayList)
		{
			System.out.println(myArrayList.indexOf(0));
		}
		System.out.println("Arreylist" +myArrayList.size());
		int a[] = {2,4,5};
		
		for (int c: a)
		{
			System.out.println(c);
		}
		
		LinkedList<Integer> llist = new LinkedList<Integer>();
		
		llist.add(0, 100);
		llist.add(0, 77);
		llist.add(0, 88);
		
	
		for( int num : llist)
		{
			System.out.println(llist.size());
			
		}
		
		System.out.println("********************************");
		ListIterator<Integer> itr = myArrayList.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("*******************AL*previous************");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		System.out.println("********************************");
		ListIterator<Integer> itr1 = llist.listIterator();

while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}

System.out.println("*******************LL*previous************");
while(itr1.hasPrevious())
{
	System.out.println(itr1.previous());
}
		
		ArrayList<Integer> newal = new ArrayList<Integer>();
		newal.add(10);
		newal.add(0, 22);
		
		ListIterator<Integer> li = newal.listIterator();
		System.out.println("List new li");
		while (li.hasNext()) {
			System.out.println(li.next());
			
		}
 	}

}
