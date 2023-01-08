import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("removeDuplicatesremoveDuplicates"));
        System.out.println(removeDuplicates("   "));
        System.out.println(removeDuplicates(""));
        System.out.println(removeDuplicates(null));
    }

    private static String removeDuplicates(String str) {
        if(Objects.isNull(str)) return "NULL input";
        return Arrays.stream(str.split(""))
                .distinct()
                .collect(Collectors.joining());
    }
    
}
