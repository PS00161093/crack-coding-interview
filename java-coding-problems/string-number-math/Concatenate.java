import java.util.Arrays;
import java.util.stream.Collectors;

public class Concatenate {
    public static void main(String[] args) {
        String[] words = {"I", "am", "a", "software", "developer"};
        String delimiter = "-";
        System.out.println(joinByDelimiter(words, delimiter));
        System.out.println(joinByDelimiter1(words, delimiter));
    }

    private static String joinByDelimiter(String[] words, String delimiter) {
        return String.join(delimiter, words);
    }

    private static String joinByDelimiter1(String[] words, String delimiter) {
        return Arrays.stream(words)
                .collect(Collectors.joining(delimiter));
    }

}
