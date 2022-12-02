import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String word = "madam";
        System.out.println(isPalindrome(word));
    }

    private static boolean isPalindrome(String word) {
        return IntStream.range(0, word.length() / 2)
                .noneMatch(i -> word.charAt(i) != word.charAt(word.length() - 1 - i));
    }

}
