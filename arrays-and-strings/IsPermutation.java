public class IsPermutation {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cbb";
        System.out.println(isPermutation(s1, s2));
    }

    /**
     * Time Complexity = O(n)
     * For a string to be a permutation of a string, it has to be:
     * 1. Of same length.
     * 2. All chars of s1 must be in s2.
     * 3. The occurrences of each char should be the same.
     * <p>
     * Assumption: check is case-sensitive.
     */
    private static boolean isPermutation(String s1, String s2) {
        if (isInvalidInput(s1, s2)) return false;

        int[] chars = new int[128];
        for (char c : s1.toCharArray()) chars[c] = chars[c] + 1;

        for (int i = 0; i < s2.length(); i++) {
            int c = s2.charAt(i);
            chars[c] = chars[c] - 1;
            if (chars[c] < 0) return false;
        }

        return true;
    }

    private static boolean isInvalidInput(String s1, String s2) {
        return s1 == null || s2 == null ||
                s1.trim().length() == 0 || s2.trim().length() == 0 ||
                s1.length() != s2.length();
    }

}
