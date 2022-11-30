import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        String statement = "I am a boy"; // Expected o/p = "yob a ma I"
        System.out.println(reverse(statement));
    }

    private static String reverse(String statement) {
        if (Objects.isNull(statement) || statement.isEmpty()) return "INVALID_INPUT";
        else if (statement.length() == 1) return statement;

        Pattern PATTERN = Pattern.compile(" +");
        String reversedWords = PATTERN.splitAsStream(statement)
                .collect(Collectors.joining(" "));

        return new StringBuilder(reversedWords).reverse().toString();
    }

}
