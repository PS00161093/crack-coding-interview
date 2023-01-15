public class CoreInfo {

    public static void main(String[] args) {

        String[] arr = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(arr));
    }

    private static String longestCommonPrefix(String[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int firstStrLen = arr[0].length();
      
        for (int prefixLen = 0; prefixLen < firstStrLen; prefixLen++) {
          
            char ch = arr[0].charAt(prefixLen);
          
            for (int i = 1; i < arr.length; i++) {
              
                if (prefixLen >= arr[i].length() || arr[i].charAt(prefixLen) != ch) {
                    return arr[i].substring(0, prefixLen);
                }
              
            }
        }

        return arr[0];
    }

}
