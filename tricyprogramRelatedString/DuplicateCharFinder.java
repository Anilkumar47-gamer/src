package tricyprogramRelatedString;
public class DuplicateCharFinder {
    public static void main(String[] args) {
        String str = "findDuplicatechar";
        int[] charCount = new int[256]; // Assuming ASCII characters
        
        // Count the occurrence of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        
        // Print the duplicate characters
        System.out.println("Duplicate characters:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i);
            }
        }
    }
}
