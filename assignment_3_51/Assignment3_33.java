package assignment_3_51;

import java.util.Scanner;

public class Assignment3_33 {

	public static void main(String[] args) {
/*		33) In a string check whether all the vowels are present
    		if yes return 1 else 2.
    		example: String = "education"
        			 Output = 1.
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.next();
		int vowel_a=0, vowel_e=0, vowel_i=0, vowel_o=0, vowel_u=0;
		boolean output = true;
		
		for(int i=0; i<string.length(); i++)
			{
				if(string.charAt(i) == 'a' || string.charAt(i) == 'A')
					vowel_a++;
				if(string.charAt(i) == 'e' || string.charAt(i) == 'E')
					vowel_e++;
				if(string.charAt(i) == 'i' || string.charAt(i) == 'I')
					vowel_i++;
				if(string.charAt(i) == 'o' || string.charAt(i) == 'O')
					vowel_o++;
				if(string.charAt(i) == 'u' || string.charAt(i) == 'U')
					vowel_u++;
			}
		if(vowel_a > 0 && vowel_e > 0 && vowel_i > 0 && vowel_o > 0 && vowel_u > 0)
			System.out.println("Output: "+output);
		else
			System.out.println("Output: "+!output);
		
		scanner.close();
	}

}
