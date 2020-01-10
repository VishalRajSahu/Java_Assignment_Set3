package assignment_3_51;

import java.util.Scanner;

public class Assignment3_9 {

	public static void main(String[] args) {
/*		9) String[] input={"100","111","10100","10","1111"} input2="10"
				   output=2;count strings having prefix"10" but "10" not included in count
				   operation-- for how many strings input2 matches the prefix of each string in input1

				   String[] input={"01","01010","1000","10","011"}
				   output=3; count the strings having prefix"10","01" but "10","01" not included
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of String Array");
		int size = scanner.nextInt();
		String [] stringArray = new String[size];
		int count = 0;
		
		System.out.println("Enter "+size+" elements of String Array");
		for(int i=0; i<size; i++)
		stringArray[i] = scanner.next();
		
		System.out.println("Enter a input to find as Prefix in String Array");
		String input = scanner.next();
		int inputLength = input.length();
		
		for(int i=0; i<size; i++)
		{
			int length = stringArray[i].length();
			if(length != inputLength)
			{
				if(stringArray[i].startsWith(input))
				count++;
			}
		}
		System.out.println("Output: "+count);
		scanner.close();
	}

}
