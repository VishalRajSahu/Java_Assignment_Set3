package assignment_3_51;

import java.util.Scanner;

public class Assignment3_7 {
		public static void main(String[] args) {
/*		7) Input1 = {“ABX”,”ac”,”acd”};
   		   Input2 = 3;
   		   Output = X$d
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of a String Array");
		int size = scanner.nextInt();
		System.out.println("Enter "+size+" elements of String Array");
		String [] stringArray = new String[size];
		String outputString = "";
		for(int i=0; i<size; i++)
			stringArray[i] = scanner.next();
		System.out.println("Enter the length of string");
		int length = scanner.nextInt();
		
		for(int i=0; i<size; i++)
			{
				if(stringArray[i].length() == length)
					{
						outputString += stringArray[i].charAt(length-1)+"$";
					}
			}
		outputString = outputString.substring(0, outputString.length() - 1);
		System.out.println(outputString);
		scanner.close();	
	}
}
