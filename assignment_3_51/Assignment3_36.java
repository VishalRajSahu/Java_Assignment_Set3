package assignment_3_51;

import java.util.Scanner;

public class Assignment3_36 {

	public static void main(String[] args) {
/*		36) find the maximum chunk of a given string
    		Input  : this isssss soooo good
    		Output = 5
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String sentence = scanner.nextLine();
		int counter = 0, max = 0;
		
		for(int i=0; i<sentence.length()-1; i++)
		{
			if(sentence.charAt(i) == ' ')
				counter = 0;
			if(sentence.charAt(i) == sentence.charAt(i+1))
				{
					counter++;
					if(max < counter)
						max = counter;
				}
		}
		System.out.println("Maximum Length of Chunks: "+(max+1));
		scanner.close();
	}

}
