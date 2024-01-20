package tricyprogramfile;

public class numreturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pandrom();
		
int num= 54321;
int store=num;
int reve =0;
  int remainder ;
while (num>0) {
	remainder= num%10;
	reve=reve*10+remainder;
	num=num/10;
	
}if (store==reve) {
	System.out.println("number is match");
	
}else {
	
System.out.println("number is not match"+reve);
	}

}
	public static void pandrom() {
		int num= 1331;
		int store=num;
		int reve =0;
		  int remainder ;
		while (num>0) {
			remainder= num%10;
			reve=reve*10+remainder;
			num=num/10;
			
		}if (store==reve) {
			System.out.println("number is match");
			
		}else {
			
		System.out.println("number is not match");
			}
	}
}
