package assignment_3_51;

import java.util.Scanner;

public class Assignment3_14 {

	public static void main(String[] args) {
/*		14) String array will be given.
  			if a string is Prefix of an any other string in that array means count.
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of String Array");
		int size = scanner.nextInt();
		int counter = 0;
		String [] stringArray = new String[size];
		System.out.println("Enter "+size+" elements of String Array");
		for(int i=0; i<size; i++)
			stringArray[i] = scanner.next();
		
		for(int i=0; i<size; i++)
			{
					for(int j=i+1; j<size; j++)
					{
						String preString = stringArray[i];
						String postString = stringArray[j];
						if(preString.startsWith(postString) || postString.startsWith(preString))
							counter++;
					}
			}
		System.out.println("Counter: "+counter);	
				
		scanner.close();
	}

}
