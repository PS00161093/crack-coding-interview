import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        String word = "ACABCD";
        System.out.println(firstNonRepeatedCharacter(word));
    }

    private static String firstNonRepeatedCharacter(String word) {
        if (Objects.isNull(word) || word.isEmpty()) return "INVALID_INPUT";
        else if (word.length() == 1) return word;

        Integer ch = word.codePoints()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse((int) Character.MIN_VALUE);

        return String.valueOf(Character.toChars(ch));
    }
  
}
