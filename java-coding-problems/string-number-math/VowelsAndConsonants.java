import org.springframework.data.util.Pair;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        String word = "AbCDeF";
        String word1 = "UvWiXyOx";
        System.out.println(countVowelsAndConsonants(word));
        System.out.println(countVowelsAndConsonants1(word1));
    }

    private static Pair<Long, Long> countVowelsAndConsonants1(String word) {
        if (Objects.isNull(word) || word.isEmpty()) return Pair.of(0L, 0L);

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        word = word.toLowerCase();

        Map<Boolean, Long> map = word.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> ch >= 'a' && ch <= 'z')
                .collect(Collectors.partitioningBy(vowels::contains, Collectors.counting()));

        return Pair.of(map.get(Boolean.TRUE), map.get(Boolean.FALSE));
    }

    private static Pair<Long, Long> countVowelsAndConsonants(String word) {
        if (Objects.isNull(word) || word.isEmpty()) return Pair.of(0L, 0L);

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        word = word.toLowerCase();

        long vowelsCount = word.chars()
                .mapToObj(c -> (char) c)
                .filter(vowels::contains)
                .count();

        long consonantsCount = word.chars()
                .mapToObj(c -> (char) c)
                .filter(o -> !vowels.contains(o))
                .count();

        return Pair.of(vowelsCount, consonantsCount);
    }

}
