import java.util.stream.Collectors;

public class RemoveChar {

    public static void main(String[] args) {
        System.out.println(removeCharacter("removeCharacter", 'e'));
    }

    private static String removeCharacter(String str, char charToRemove) {
        return str.chars()
                .filter(ch -> ch != charToRemove)
                .mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.joining());
    }

}
