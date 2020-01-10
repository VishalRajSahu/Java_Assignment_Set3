package assignment_3_51;

import java.util.Scanner;

public class Assignment3_44 {

	public static void main(String[] args) {
/*		44) Find the Maximum span of the given array.
    		span is the number of elements between the duplicate element
    		including those 2 repeated numbers.
    		if the array as only one element,then the span is 1.
				input[] = {1,2,1,1,3}
				output  = 4
				input[] = {1,2,3,4,1,1,5}
				output  = 6
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Integer Array");
		int size = scanner.nextInt();
		int [] intArray = new int[size];
		int max = 0, counter;
		System.out.println("Enter "+size+" elements of an Integer Array");
		for(int i=0; i<size; i++)
			intArray[i] = scanner.nextInt();
		
		for(int i=0; i<size; i++)
		{
			counter = 1;
			for(int j=i+1; j<size; j++)
			{
				if(intArray[i] != intArray[j])
					counter++;
			}
			if(max < counter)
				max = counter;
		}
		//if there is no duplicate elements
		if(max == size && max != 1)
			max = 0;
		System.out.println("Output: Maximum Span ---> "+max);
				
		scanner.close();
	}

}
