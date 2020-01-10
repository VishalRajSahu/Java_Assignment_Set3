package assignment_3_51;

import java.util.Scanner;

public class Assignment3_34 {

	public static void main(String[] args) {
/*		34) Swap the every 2 characters in the given string 
    		If size is odd number then keep the last letter as it is.
    		Example:- Input  :  forget
	 			      Output :  ofgrte
    		Example:- Input  :  NewYork
         		 	  Output :  eNYwrok
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.next();
		char [] charArray = string.toCharArray();
		
		for(int i=0; i<charArray.length-1; )
			{
				char temp = charArray[i];
				charArray[i] = charArray[i+1];
				charArray[i+1] = temp;
				i += 2;
			}
		System.out.print("Output: ");
		for(int i=0; i<charArray.length; i++)
			System.out.print(charArray[i]+" ");
				
		scanner.close();
	}

}
