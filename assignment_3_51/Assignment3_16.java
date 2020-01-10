package assignment_3_51;

import java.util.Scanner;

public class Assignment3_16 {

	public static void main(String[] args) {
/*		16) int[] input={2,1,4,1,2,3,6};
	    check whether the input has the sequence of "1,2,3". if so-
	    output=true;
	    int[] input={1,2,1,3,4,5,8};
	    output=false
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of Integer Array");
		int size = scanner.nextInt();
		int flag = 0;
		int [] intArray = new int[size];
		System.out.println("Enter "+size+" elements of Integer Array");
		for(int i=0; i<size; i++)
			intArray[i] = scanner.nextInt();
		
		for(int i=0; i<size-2; i++)
		{
			if(Math.abs(intArray[i+1]-intArray[i]) == 1 && Math.abs(intArray[i+2]-intArray[i+1])== 1)
				flag = 1;
		}
		if(flag == 1)
			System.out.println("Three Consecutive Numbers: True");
		else
			System.out.println("Three Consecutive Numbers: False");
		
		scanner.close();
	}

}
