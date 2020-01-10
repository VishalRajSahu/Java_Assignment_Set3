package assignment_3_51;

import java.util.Scanner;

public class Assignment3_1 {

	public static void main(String[] args) {
/*		1) Find the sum of the numbers in the given input string array
	   		Input{“2AA”,”12”,”ABC”,”c1a”)
	   		Output:6 (2+1+2+1)
	   			Note in the above array 12 must not considered as such
	   			i.e,it must be considered as 1,2
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int sum = 0;
		String [] stringArray = new String[size];
		System.out.println("Enter "+size+" elements of an array");
		for(int i=0; i<size; i++)
			stringArray[i] = scanner.next();
		
		for(int i=0; i<size; i++)
		{
			String string = stringArray[i];
			char [] charArray = string.toCharArray();
			int j = 0;
			while(j < string.length())
			{
			if(charArray[j] >= 48 && charArray[j] <= 57 )
				sum += Character.getNumericValue(charArray[j]);
				j++;
			}
		}
		System.out.println("Sum of Digits in String Array: "+sum);
		
		scanner.close();
	}
}