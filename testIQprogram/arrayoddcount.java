package testIQprogram;

public class arrayoddcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {1,2,3,4,5,6,7,41,8,9,9,21,23,43,34,45,55,51};
		int count=0;
		for (int i = 0; i <=a.length; i++) {
			System.out.println(a);
			if (i%a.length==0) {
				count++;
			}
		}if (count==0) {
			System.out.println(a);
		}else {
			System.out.println("not prime  number");
		}
		
		
		
	}

}
