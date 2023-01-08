import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class MaxOccurance {

    public static void main(String[] args) {
        System.out.println(maxOccurrenceCharacter("removeCharacter"));
    }

    private static Map.Entry<Character, Long> MaxOccurance(String str) {
        if (Objects.isNull(str)) return Map.entry(Character.MIN_VALUE, -1L);

        return str.chars()
                .filter(ch -> !Character.isWhitespace(ch))
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.agroupingBy(ch -> ch, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(Map.entry(Character.MIN_VALUE, -1L));
    }

}
