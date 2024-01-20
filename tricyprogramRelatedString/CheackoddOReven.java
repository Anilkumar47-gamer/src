package tricyprogramRelatedString;

import java.util.Scanner;

public class CheackoddOReven {

	public static void main(String[] args) {
int oddcount =0,evencount=0;
Scanner ss=new Scanner(System.in);
System.out.println("Please Enter odd or even number");

for (int i = 1; i <=100; i++) {
	if (i%2==1) {
		oddcount=oddcount+i;
		
	}
	else {
		evencount=evencount+i;
	}
	
}
System.out.println("Number is odd"+oddcount);
		System.out.println("Number is Even"+evencount);
		
	}

}
