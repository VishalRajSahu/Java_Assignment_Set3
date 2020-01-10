package assignment_3_51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment3_20 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
/*		20) input1 - List1 - {apple, orange, grapes}
	    	input2 - List2 - {melon, apple, mango}
	    	output = {mango, orange}
	    			operation-- In 1st list remove strings starting with 'a' or 'g'
	                In 2nd list remove strings ending with 'n' or 'e'
	    			Ignore case, return in string array
*/
		
		List<String> firstList = new ArrayList<String>();
		List<String> secondList = new ArrayList<String>();
		List<String> outputList = new ArrayList<String>();
		Assignment3_20 assignment3_20 = new Assignment3_20();
		String serial ;
		//Adding Elements on both List
		serial = "first";
		assignment3_20.addElement(firstList, serial);
		serial = "second";
		assignment3_20.addElement(secondList, serial);
				
		System.out.println(firstList);
		System.out.println(secondList);
		
		//Removing Elements starts with 'a' or 'g' from First List
		for(int i=0; i<firstList.size(); i++)
		{
			String word = firstList.get(i);
			if(word.charAt(0) != 'a' && word.charAt(0) != 'A' && word.charAt(0) != 'g' && word.charAt(0) != 'G')
				outputList.add(word);
		}
				
		//Removing Elements ends with 'n' or 'e' from Second List
		for(int i=0; i<secondList.size(); i++)
		{
			String word = secondList.get(i);
			if(word.charAt(word.length()-1) != 'n' && word.charAt(word.length()-1) != 'N' && word.charAt(word.length()-1) != 'e' && word.charAt(word.length()-1) != 'E')
				outputList.add(word);
		}
		
		//Storing and Printing data on String Array as requirement
		Collections.sort(outputList);
		String [] stringArray = new String[outputList.size()];
		for(int i=0; i<outputList.size(); i++)
			stringArray[i] = outputList.get(i);
		
		System.out.print("\nOutput String Array: ");
		for(String word: stringArray)
			System.out.print(word+" ");
		
		scanner.close();
	}
	
	public void addElement(List<String> list, String serial)
	{
		String choice;
			do 
			{
				System.out.println("Enter Strings for "+serial+" List");
				list.add(scanner.next());
				System.out.println("Do you want add more value Press 'Y' for Yes and 'N' for No");
				choice = scanner.next();
			}while(choice.equalsIgnoreCase("Y"));
	}
}
