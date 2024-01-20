package tricyprogramRelatedString;

import java.util.Scanner;

public class primeNumber1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner sc=new Scanner(System.in);
		System.out.println("please Enter the  number");
int num,c=0;

for (int i = 1; i <=5; i++) {
 	num=0;
 	//c=sc.nextInt();
	for (int j = 2; j <=i/2; j++) {
		if (i%j==0) {
			num++;
		}
		
	}
	if (num==0) {
	c++;
		
	}
} 
System.out.println(c);







	}

}
