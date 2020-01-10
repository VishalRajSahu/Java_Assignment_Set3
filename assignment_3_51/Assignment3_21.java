package assignment_3_51;

import java.util.Scanner;

public class Assignment3_21 {

	public static void main(String[] args) {
/*		21) input1-- Hello*world
    		output-- boolean(true or false)
    		operation-- if the character before and after * are same return true else false
            if there in no star in the string return false(Ignore case)
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String with *");
		String string = scanner.next();
		int flag = 0;
		boolean ans = true;
		String lowercase = string.toLowerCase();
		for(int i=0; i<lowercase.length(); i++)
		{
			if(lowercase.charAt(i) == '*')
				{
					flag = 1;
					if(lowercase.charAt(i-1) == lowercase.charAt(i+1))
						System.out.println("Before and After of * both Characters are Same: "+ans);
					else
						System.out.println("Before and After of * both Characters are not Same: "+!ans);
				}
		}
		if(flag == 0)
			System.out.println("* is not available on String: "+!ans);
		
		
		scanner.close();
	}

}
