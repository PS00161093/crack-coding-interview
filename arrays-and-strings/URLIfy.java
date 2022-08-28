import java.util.Objects;

public class URLIfy {

    public static void main(String[] args) {
        String s1 = "Mr John Smith   ";
        int length = 13;
        System.out.println(urlIfy(s1, length));
    }

    /**
     * Time Complexity = O(n)
     */
    private static String urlIfy(String s1, int length) {
        if (s1 == null || s1.trim().length() == 0) return "";

        StringBuilder sb = new StringBuilder();
        String[] words = s1.split(" ");

        for (int i = 0; i < words.length - 1; i++) {
            sb.append(words[i]).append("%20");
        }
        sb.append(words[words.length - 1]);

        return sb.toString();
    }

}
