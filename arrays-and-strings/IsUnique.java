import java.util.HashSet;
import java.util.Set;

public class IsUnique {

    public static void main(String[] args) {
        System.out.println(isUnique("abccde"));
    }

    /**
     * Time Complexity = O(n)
     */
    private static boolean isUnique(String stringToCheck) {
        if(stringToCheck == null || stringToCheck.trim().length() == 0) return false;
        
        Set<Character> chars = new HashSet<>();
        for (char c : stringToCheck.toCharArray()) {
            if (chars.contains(c)) return false;
            else chars.add(c);
        }

        return true;
    }
}
