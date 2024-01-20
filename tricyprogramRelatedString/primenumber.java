package tricyprogramRelatedString;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=-11;
		int count =0;
		for (int i = 1; i <=-a; i++) {
			
			if (a%i==0) {
				count++;
			}
		}if (count==2) {
			System.out.println("this is prime number");
		}else {
			System.out.println("this is not prime number");
		}
		
		
	}

}
