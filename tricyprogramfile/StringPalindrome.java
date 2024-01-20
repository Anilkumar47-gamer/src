package tricyprogramfile;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String  s ="Madam";
		String s="KANAK";
		StringBuilder  sb=new StringBuilder(s);
		StringBuilder temp=sb.reverse();
		 String builder= temp.toString();
		if (s.equalsIgnoreCase(builder)) {
			System.out.println("String is palindrome");
		} else {
System.out.println("this is not palidrome");
		}
	}

}
