/**
 * String Compression: Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
 * "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 * <p>
 * Time Complexity: O(n), where n is length of bigger string
 */
public class StringCompression {

    public static void main(String[] args) {
        String stringToCompress = "fffffggggggggggab";
        System.out.println(compress(stringToCompress));
    }

    private static String compress(String stringToCompress) {
        StringBuilder compressed = new StringBuilder();
        int currentCharCount = 0;
        int index = 0;
        for (int i = 0; i < stringToCompress.length(); i = index) {
            while (index < stringToCompress.length() && stringToCompress.charAt(i) == stringToCompress.charAt(index)) {
                currentCharCount++;
                index++;
            }
            compressed.append(stringToCompress.charAt(i)).append(currentCharCount);
            currentCharCount = 0;
        }

        return stringToCompress.length() < compressed.toString().length() ? stringToCompress : compressed.toString();
    }

}
