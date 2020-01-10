package assignment_3_51;

import java.util.Scanner;

public class Assignment3_38 {

	public static void main(String[] args) {
/*		38) input1 =  {2,4,3,5,6};
	    			  if odd  find cube 
	    			  if even find square
	    			  finally add it
	    	output1 = 208(4+16+27+125+36)
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Integer Array");
		int size = scanner.nextInt();
		int [] intArray = new int[size];
		int sum = 0;
		System.out.println("Enter "+size+" elements of an Integer Array");
		for(int i=0; i<size; i++)
			intArray[i] = scanner.nextInt();
		
		for(int i=0; i<size; i++)
		{
			if(intArray[i] % 2 == 0)
				sum += Math.pow(intArray[i], 2);
			else
				sum += Math.pow(intArray[i], 3);
		}
		System.out.println("Output: "+sum);
		
		
		scanner.close();
	}

}
