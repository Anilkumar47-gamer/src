package tricyprogramfile;

public class REVERSNUMBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=123456,
		rev=0;
		while(n!=0) {
			int r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		System.out.println("Reversed="+rev);
		
		
	}

}
