/**
 * String Rotation: Assume you have a method isSubstring which checks if one word is a substring
 * of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one
 * call to isSubstring (e.g., "waterbottle" is a rotation of" erbottlewat").
 * Time Complexity: O(n)
 */
public class StringRotation {

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(isSubstring(s1, s2));
    }

    private static boolean isSubstring(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            String left = s1.substring(0, i + 1);
            String right = s1.substring(i + 1);
            String temp = right + left;
            if (temp.equals(s2)) return true;
        }

        return false;
    }

    /**
     * If we imagine that 52 is a rotation of s1, then we can ask what the rotation point is. For example, if you
     * rotate waterbottle after wat. you get erbottlewat. In a rotation, we cut 51 into two parts, x and y,
     * and rearrange them to get 52.
     * s1 = xy = waterbottle
     * x = wat
     * y = erbottle
     * s2 = yx = erbottlewat
     * So, we need to check if there's a way to split s1 into x and y such that xy = s1 and yx = s2. Regardless of
     * where the division between x and y is, we can see that yx will always be a substring of xyxy.That is, s2 will
     * always be a substring of s1s1.
     */
    private static boolean isSubstringSimpler(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) return false;
        return (s1.concat(s1)).contains(s2);
    }

}
