import java.util.Objects;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        String word = "ACABCD";
        System.out.println(frequency(word));
    }

    private static int frequency(String word) {
        if (Objects.isNull(word) || word.length() == 0) return 0;
        else if (word.length() == 1) return 1;

        return (int) word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .values().stream()
                .filter(v -> v > 1)
                .count();

    }
}
