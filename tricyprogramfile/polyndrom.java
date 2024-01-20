package tricyprogramfile;

import java.util.Scanner;

public class polyndrom {

	//public static void main(String[] args) {
//		// TODO Auto-generated method stub
//String a ="";
//String store ="ajay";
//
//for (int i = store.length()-1; i <=0; i--) {
//	
//}


		
		public static void main(String args[])
		{
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome");
		original = in.nextLine();
		int length = original.length();
		for ( int i = length - 1; i >= 0; i-- )
		reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
		System.out.println(original+" is a palindrome.");
		else
		System.out.println(original+" is not a palindrome.");
		}
		


	}


