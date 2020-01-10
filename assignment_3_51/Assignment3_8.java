package assignment_3_51;

import java.util.Scanner;

public class Assignment3_8 {
		public static void main(String[] args) {
/*		8) INPUT1 = helloworld
		   INPUT2 = 2. delete the char,if repeated twice.
		   if occurs more than twice,leave the first occurrence and delete the duplicate
		   Output = helwrd;
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.next();
		System.out.println("Enter a value to delete duplicate characters (Eg. 2-Twice, 3-Trice...)");
		int repetition = scanner.nextInt();
		StringBuffer strBuffer = new StringBuffer(string);
		int counter;
		
		for(int i=0; i<strBuffer.length(); i++)
		{
			counter = 1;
			for(int j=i+1; j<strBuffer.length(); j++)
			{
				if(strBuffer.charAt(i) == strBuffer.charAt(j))
					counter++;
			}
			if(counter == repetition)
			{
				for(int j=i+1; j<strBuffer.length(); j++)
				{
					if(strBuffer.charAt(i) == strBuffer.charAt(j))
						strBuffer.deleteCharAt(j);
				}
				strBuffer.deleteCharAt(i);
				i--;
			}
		}
		System.out.println("Output String: "+strBuffer);
		scanner.close();
	}
}
