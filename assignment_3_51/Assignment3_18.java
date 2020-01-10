package assignment_3_51;

import java.util.Scanner;

public class Assignment3_18 {

	public static void main(String[] args) {
/*		18) Input1 = ”cowboy”; Output1 = ”cowcow”;
	    	Input1 = ”so”;     Output1 = ”sososo”; 
	    HINT: if they give 3 letter word u have to display 2 time;
*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String");
		String firstString = scanner.next();
		System.out.println("Enter Second String");
		String secondString = scanner.next();
		StringBuffer stringBuffer = new StringBuffer();
		if(secondString.length() == 3)
		for(int i=0; i<secondString.length()-1; i++)
		{	
			stringBuffer.append(firstString.substring(0, secondString.length()));
		}	
		
		if(secondString.length() == 2)
		for(int i=0; i<secondString.length()+1; i++)
		{			
				stringBuffer.append(firstString.substring(0, secondString.length()));	
		}
		
		System.out.println(stringBuffer);
		
		scanner.close();
		
		
	}

}
