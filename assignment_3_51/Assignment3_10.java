package assignment_3_51;

import java.util.Scanner;

public class Assignment3_10 {

	public static void main(String[] args) {
/*		10) input1 = 1 , input2 = 2 , input3 = 3 --- output = 6;
	    	input1 = 1 , input2 = 13, input3 = 3 --- output = 1;
	    	input1 = 13, input2 = 2 , input3 = 8 --- output	= 8;
	    	if value equal to 13,escape the value '13', as well as the next value to 13.
	    	sum the remaining values
*/
		Scanner scanner = new Scanner(System.in);
		int [] inputArray = new int[3];
		int sum = 0;
		System.out.println("Enter 3 Inputs");
		for(int i=0; i<3; i++)
			inputArray[i] = scanner.nextInt();
		
		for(int i=0; i<3; i++)
		{
			if(inputArray[0]== 13 && inputArray[1]==13)
			{
				sum = 0;
				break;
			}
			if(inputArray[i] == 13)
				i++;
			else
				sum += inputArray[i];
		}
		System.out.println("Sum  of Inputs: "+sum);
		
		scanner.close();		
	}

}
