package easy;

import java.util.Arrays;
import java.util.Stack;

public class December_13_2020 {

    // Leetcode 14
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

    // Leetcode 20
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));

        String s = "(){}[]";
        String t = "(())(}{}[]";

        System.out.println(isValid(s) == true ? "pass" : "fail");
        System.out.println(isValid(t) == false ? "pass" : "fail");
    }
}
