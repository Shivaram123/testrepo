package initials.practice.com;

public class ArrayPractice {

	public static void main(String[] args) 
	{
		int[] myArray1 = {1,2,3,4,5};//Preferred Way
		
		int myArray2[] = {1,2,3,4,5};//Not a preferred way
		System.out.println(myArray1[0]);
		//3rd Way
		int[] myArray3 = new int[3];
		myArray3[0] = 0;
		myArray3[1] = 1;
		myArray3[2] = 2;
		System.out.println(myArray3[0]);
		
		//4th Way
		int[] myArray4 = new int[] {1,2,3};
		
		
	}

}
