
package assignment_3_51;

import java.util.HashMap;
import java.util.Scanner;

public class Assignment3_2 {

	public static void main(String[] args) {
/*		2) Create a program to get the hashmap from the given input string array where the key for the hashmap
	   	   is first three letters of array element in uppercase and the value of hashmap is the element itself.
	   		Input : {“goa”,”kerala”,”gujarat”}                 [string array]
	   		Output : {{GOA,goa},{KER,kerala},{GUJ,Gujarat}}    [hashmap]
*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of String Array");
		int size = scanner.nextInt();
		String [] stringArray = new String[size];
		
		System.out.println("Enter "+size+" elements of String Array");
		for(int i=0; i<size; i++)
			stringArray[i] = scanner.next();
		
		HashMap<String, String> cityHMap = new HashMap<String, String>(size);
		for(int i=0; i<size; i++)
			{	
				String city = stringArray[i];
				String key = city.substring(0, 3);
				key = key.toUpperCase();
				cityHMap.put(key, city);
			}
		System.out.println(cityHMap);
		scanner.close();
	}

}
