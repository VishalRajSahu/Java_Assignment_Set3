package assignment_3_51;

import java.util.Scanner;

public class Assignment3_37 {

	public static void main(String[] args) {
/*		37) Input1 : new york
    		Input1 : new jersey
    		Output : new y+r+
    		Logic  : if first string's char matched with second string's char print as it is, 
    				 otherwise print + sign.
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Sentence");
		String first_sentence = scanner.nextLine();
		System.out.println("Enter Second Sentence");
		String second_sentence = scanner.nextLine();
		String output = "";
		int flag;
		for(int i=0; i<first_sentence.length(); i++)
		{
			flag = 0;
			for(int j=0; j<second_sentence.length(); j++)
			{
				if(first_sentence.charAt(i) == second_sentence.charAt(j))
					{
						flag = 1;
						break;
					}
			}
			if(flag == 1)
				output += first_sentence.charAt(i);
			else
				output += '+';
		}
		System.out.println("Output String: "+output);
		
		scanner.close();
	}

}
