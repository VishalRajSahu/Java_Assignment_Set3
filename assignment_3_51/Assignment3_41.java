package assignment_3_51;

import java.util.Scanner;

public class Assignment3_41 {

	public static void main(String[] args) {
/*		41) Input  : "this is sample test case"
		    Output : "this amplec"
		    remove the duplicates in the given string
*/

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String sentence = scanner.nextLine();
		StringBuffer strBuffer = new StringBuffer(sentence);
		for(int i=0; i<strBuffer.length(); i++)
		{
			for(int j=i+1; j<strBuffer.length(); j++)
			{
				if(strBuffer.charAt(i) == strBuffer.charAt(j))
				{
					strBuffer.deleteCharAt(j);
				}
			}
		}
		System.out.println("Output: "+strBuffer);
		
		scanner.close();
	}

}
