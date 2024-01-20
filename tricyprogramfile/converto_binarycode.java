package tricyprogramfile;

public class converto_binarycode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int d=10001;
//String e="r";
String str = Integer.toBinaryString(d);
String st= Integer.toOctalString(d);
String st1= Integer.toHexString(d);
Integer st2= Integer.bitCount(d);
int st3= Integer.highestOneBit(d);



System.out.println(st);
System.out.println(str);
System.out.println(st1);
System.out.println(st2);
System.out.println(st3);
	}

}
