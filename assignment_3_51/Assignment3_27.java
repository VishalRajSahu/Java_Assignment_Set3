
package assignment_3_51;

import java.util.Scanner;

public class Assignment3_27 {
	
	public static void main(String[] args) {
/*		27) Validate Password
    		Validation based on following criteria:
  				-> minimum length is 8
  				-> should contain any of these @/_/#
  				-> should not start with number/special chars(@/#/_)
  				-> should not end with special chars
  				-> can contain numbers,letters,special chars	
*/		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Password Guilelines: \ni) Minimum length is 8.\nii) Should contain any of these @/_/#.\niii) Should not start with number/special chars(@/#/_).\niv) Should not end with special chars.\nv) Can contain numbers,letters,special chars.");
		System.out.println("\nEnter Your Password");
		String password = scanner.next();
		int specialCounter = 0, flag = 0, specialFlag = 0;
		for(int i=0; i<password.length(); i++)
		{
			if ((password.charAt(0) >= 'A' && password.charAt(0) <= 'Z')
    			||	(password.charAt(0) >= 'a' && password.charAt(0) <= 'z'))
				flag = 1;
			if (password.charAt(password.length()-1) == '@'
				|| password.charAt(password.length()-1) == '#'
				|| password.charAt(password.length()-1) == '_')
				specialFlag = 1;
            if (password.charAt(i) == '@' || password.charAt(i) == '_' || password.charAt(i) == '#') 
            	specialCounter++;
        }
		if(password.length() >= 8)
		{
			if(specialCounter >= 1)
			{
				if(specialFlag == 0)
				{
					if(flag == 1)
					{
						System.out.println("Password is Valid");
					}
					else System.out.println("Password must start with Characters");
				}
				else System.out.println("Password should not end with Special Characters");
			}
			else System.out.println("Password must contain atleast one of '@','_' or '#' characters");
		}
		else System.out.println("Password must contain atleast 8 characters");
		scanner.close();
	}

}
