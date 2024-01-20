package tricyprogramRelatedString;

public class arryprimenumber {

	public static void main(String[] args) {
	
int primenum=0;
int  sum=0;
int a[]= {7,8,9,5,4,3,6};
for (int i = 0; i < a.length; i++) {
	int b=a[i];
	System.out.println(b);
	int count=1;
	
	for (int j = 1; j <=b; j++) {
		if (b%i==0) {
			count++;
			
		}
		if (count==2) {
			sum =sum+b;
			primenum++;
			
		}
		System.out.println(sum);
	//System.out.println(sum/primenum);
}
 }



	}

}
