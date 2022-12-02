import java.util.Objects;

public class App {
    public static void main(String[] args) {
        String word = "PRASHANT_SHARMA";
        System.out.println(countOccurrencesOfACertainCharacter(word, 'A'));
    }

    private static int countOccurrencesOfACertainCharacter(String word, char ch) {
        if (Objects.isNull(word) || word.isEmpty()) return -1;
        return (int) word
                .chars()
                .filter(c -> c == ch)
                .count();
    }

}
