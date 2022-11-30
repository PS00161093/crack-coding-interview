import java.util.Objects;

public class App {
    public static void main(String[] args) {
        String numeric = "123456";
        String alphaNumeric = "123PS456";
        System.out.println(containsOnlyDigits(numeric));
        System.out.println(containsOnlyDigits1(alfaNumeric));
    }

    private static boolean containsOnlyDigits(String word) {
        if (Objects.isNull(word) || word.isEmpty()) return Boolean.FALSE;
        return !word.chars()
                .anyMatch(n -> !Character.isDigit(n));
    }

    private static boolean containsOnlyDigits1(String word) {
        if (Objects.isNull(word) || word.isEmpty()) return Boolean.FALSE;
        return word.matches("[0-9]+");
    }

}
