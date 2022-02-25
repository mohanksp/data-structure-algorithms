package educative.ds.graph.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SlidingMethod {
    public static void main(String[] args) {
        System.out.println("sliding method");
        int[] arr = {2, 1, 5, 2, 3, 2};
        int k = 2;
        System.out.println("min length : " + slidingMethod("abcbbc", k));
    }

    private static int slidingMethod(String str, int k) {
        //str = "ABCAC";
        int maxLength = 0;
        String subStr = "";
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0; end < str.length(); end++) {
            map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0) + 1);
            while (map.size() > k) {
                map.put(str.charAt(start), map.get(str.charAt(start)) - 1);
                if (map.get(str.charAt(start)) == 0) {
                    map.remove(str.charAt(start));
                }
                start++;
            }
            if (end - start + 1 > maxLength) {
                subStr = str.substring(start, end + 1);
                maxLength = end - start + 1;
            }
            //maxLength = Math.max(maxLength, end - start + 1);
        }
        System.out.println(subStr);
        return maxLength == Integer.MAX_VALUE ? 0 : maxLength;
    }
}
