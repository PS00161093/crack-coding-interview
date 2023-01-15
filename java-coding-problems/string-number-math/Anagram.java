import java.util.stream.IntStream;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "rat";
        String s2 = "car";
        System.out.println(isAnagram(s1, s2));
    }

    private static boolean isAnagram(String s1, String s2) {
        char[] s1Chars = s1
                .replaceAll("\\s", "")
                .toLowerCase()
                .toCharArray();

        char[] s2Chars = s2
                .replaceAll("\\s", "")
                .toLowerCase()
                .toCharArray();

        if (s1Chars.length != s2Chars.length) {
            return false;
        }

        int[] chCounts = new int[256];
        IntStream.range(0, s1Chars.length).forEach(i -> {
            chCounts[s1Chars[i]] = chCounts[s1Chars[i]] + 1;
            chCounts[s2Chars[i]] = chCounts[s2Chars[i]] - 1;
        });

        for (int chCount : chCounts) {
            if (chCount != 0) {
                return false;
            }
        }

        return true;
    }

}
