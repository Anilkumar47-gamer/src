package tricyprogramRelatedString;
// Java code to reverse a string

//public class ReverseString {
//    public static void main(String[] args) {
//        String str = "Hello World";
//        String reversed = reverseString(str);
//        System.out.println(reversed);
//    }
//    
//    public static String reverseString(String str) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            sb.append(str.charAt(i));
//        }
//        return sb.toString();
//    }
//}


/////////////////////////////////////////////////////////////////////////////////
public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println(reversed);
    }
}



///////////////////////////////////////////////////////////////////////////////














