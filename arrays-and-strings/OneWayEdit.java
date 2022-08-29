import java.util.HashMap;
import java.util.Map;

/**
 * Time Complexity: O(n), where n is length of bigger string
 */
public class OneWayEdit {

    public static void main(String[] args) {
        String s1 = "aabbccd";
        String s2 = "aabbccee";
        System.out.println(isOneWay(s1, s2));
    }

    private static boolean isOneWay(String s1, String s2) {

        int len1 = s1.trim().length();
        int len2 = s2.trim().length();

        Map<Character, Integer> map = new HashMap<>();
        if (len1 - len2 == 1) {
            mapCounts(s1, map);
            removeCommonChars(s2, map);
            return isOneWay(map);
        } else if (len2 - len1 == 1) {
            mapCounts(s2, map);
            removeCommonChars(s1, map);
            return isOneWay(map);
        } else if (len1 == len2) {
            mapCounts(s2, map);
            removeCommonChars(s1, map);
            return isOneWay(map);
        }

        return false;
    }

    private static void mapCounts(String s1, Map<Character, Integer> map) {
        for (char c : s1.toCharArray()) {
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
    }

    private static void removeCommonChars(String s2, Map<Character, Integer> map) {
        for (char c : s2.toCharArray()) {
            if (map.containsKey(c) && map.get(c) > 1) map.put(c, map.get(c) - 1);
            else if (map.containsKey(c) && map.get(c) == 1) map.remove(c);
        }
    }

    private static boolean isOneWay(Map<Character, Integer> map) {
        return map.size() == 1 & map.values().stream().toList().get(0) == 1;
    }
}
