package tricyprogramRelatedString;

import java.util.Scanner;

public class ReversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String original = "anil I LOVE  INDIA";
			 String reverse = "";
			
			
			int length = original.length();
			for (int i = length - 1; i >= 0; i--)
		reverse = reverse + original.charAt(i);
		//	reverse = original.charAt(i);

			System.out.println("Reverse of entered string is: " + reverse);
			
		
	
	}

	}

