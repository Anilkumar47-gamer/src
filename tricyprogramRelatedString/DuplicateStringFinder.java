package tricyprogramRelatedString;
import java.util.ArrayList;
import java.util.List;

public class DuplicateStringFinder {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi", "orange", "mango", "apple"};
        List<String> duplicates = findDuplicateStrings(strings);
        System.out.println("Duplicate strings: " + duplicates);
    }

    public static List<String> findDuplicateStrings(String[] strings) {
        List<String> duplicates = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j]) && !duplicates.contains(strings[i])) {
                    duplicates.add(strings[i]);
                }
            }
        }
        return duplicates;
    }
}
