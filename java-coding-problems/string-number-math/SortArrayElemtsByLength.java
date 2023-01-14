import javax.swing.SortOrder;
import java.util.Arrays;
import java.util.Comparator;

public class SortArrayElemtsByLength {
    public static void main(String[] args) {
        String[] arr = {"laptop", "cpu", "computer", "mouse", "keyboard"};
        System.out.println(Arrays.toString(sortArrayByLength(arr, SortOrder.ASCENDING)));
        System.out.println(Arrays.toString(sortArrayByLength(arr, SortOrder.DESCENDING)));
    }

    private static String[] sortArrayByLength(String[] arr, SortOrder order) {
        if (SortOrder.ASCENDING.equals(order)) {
            return Arrays.stream(arr)
                    .sorted(Comparator.comparingInt(String::length))
                    .toArray(String[]::new);
        }
        return Arrays.stream(arr)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toArray(String[]::new);
    }
    
}
