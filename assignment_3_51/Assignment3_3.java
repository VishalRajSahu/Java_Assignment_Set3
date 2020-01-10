package assignment_3_51;

import java.util.Scanner;

public class Assignment3_3 {

	public static void main(String[] args) {
/*		3) String[] input1=["Vikas","Lokesh",Ashok]
		   expected output String: "Vikas,Lokesh,Ashok"
*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of String Array");
		int size = scanner.nextInt();
		String [] stringArray = new String[size];
		String outputString = "";
		System.out.println("Enter "+size+" elements of String Array");
		for(int i=0; i<size; i++)
			stringArray[i] = scanner.next();
		
		for(int i=0; i<size; i++)
			{
				if(i == size-1)
					outputString += stringArray[i];
				else
					outputString += stringArray[i]+",";
			}
		System.out.println(outputString);
		
		scanner.close();
	}

}
