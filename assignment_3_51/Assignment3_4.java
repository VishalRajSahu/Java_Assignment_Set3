package assignment_3_51;

import java.util.Scanner;

public class Assignment3_4
{
	public static void main(String[] args) {
	
/*		4) Email Validation
   		   String input1="test@gmail.com"
                1)@ & . should be present;
                2)@ & . should not be repeated;
                3)there should be five characters between @ and .;
                4)there should be atleast 3 characters before @ ;
                5)the end of mail id should be .com;
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Email_id to Validate");
		String string = scanner.next();
		int flag = 0;
		
		//The end of mail id should be .com
			if(string.endsWith(".com") == true)
				flag++;
			else
				System.out.println("Email id must ends with .com");
		
		//There should be five characters between @ and .
			if((string.indexOf('.')-string.indexOf('@')-1) == 5)
				flag++;
			else
				System.out.println("Email id must have five characters between @ and .");
		
		//There should be atleast 3 characters before @
			if(string.indexOf('@') > 2)
				flag++;
			else
				System.out.println("Email id must contains atleast 3 characters before @");
		
		//@ & . should be present
			if(string.indexOf('.') != -1 && string.indexOf('@') != -1)
				flag++;
			else
				System.out.println("Email id must contains @ & . ");
		
		//@ & . should not be repeated
			if(string.indexOf('.') == string.lastIndexOf('.')
					&& string.indexOf('@') == string.lastIndexOf('@'))
				flag++;
			else
				System.out.println("Email id should not repeated with @ & . ");
		
		//Email id Validation
			if(flag == 5)
				System.out.println("Valid Email Id");
			else
				System.out.println("Invalid Email Id");
		scanner.close();
	}	
}