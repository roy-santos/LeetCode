package easy;

import java.util.Arrays;

public class December_13_2020 {
    static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        for  (int i=0; i<first.length(); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return i == 0 ? "" : first.substring(0, i);
            }
        }
        return first;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}
