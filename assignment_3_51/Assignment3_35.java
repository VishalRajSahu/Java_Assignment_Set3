package assignment_3_51;

import java.util.Scanner;

public class Assignment3_35 {

	public static void main(String[] args) {
/*		35) i/p: bengal
    		o/p: ceogbl
    		if z is there replace with a
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.next();
		String outputString = "";
		
		for(int i=0; i<string.length(); i++)
			{
				if(i % 2 == 0)
					{
						if(string.charAt(i) == 'Z')
							outputString += 'A';
						else if(string.charAt(i) == 'z')
							outputString += 'a';
						else
							outputString += (char) (string.charAt(i)+1);
					}
				else
					outputString += (string.charAt(i));
			}
		System.out.println(outputString);
		
		scanner.close();
	}

}
