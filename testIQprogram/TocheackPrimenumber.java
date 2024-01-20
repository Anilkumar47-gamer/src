package testIQprogram;

import java.util.Scanner;

public class TocheackPrimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n;
		Scanner sc=  new Scanner(System.in);
		System.out.println("please Enter a number");
		n=sc.nextInt();
		int count=0;
		for (int i = 0; i<=n/2; i++) {
			if(n%i==0) {
			count=1;
			}
		}
		if(count==1) {
			System.out.println("This is a prime number");
		}
		else {
			System.out.println("This is not prime number");
		}
		{
			
		}
		
		
	}

}
