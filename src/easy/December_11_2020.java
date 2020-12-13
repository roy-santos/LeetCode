package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class December_11_2020 {
    // Leetcode #1389
    static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] resultArray = list.stream().mapToInt(i -> i).toArray();
        return resultArray;
    }

    // Leetcode #7
    static int reverse(int x) {
        long result = 0;

        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }

        if(result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE)
            return (int)result;
        else
            return 0;
    }

    // Leetcode #9
    static boolean isPalindrome(int x) {
        if (x < 0 || (x!=0 && x%10==0)) {
            return false;
        }
        int reverse = 0;

        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        return x == reverse || x == reverse/10;

    }

    // Leetcode # 13
    static int romanToInt(String s) {
        int count = 0;

        for (int i=0; i<s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == 'I' && s.charAt(i+1) == 'V') {
                count += 4;
                i++;
            } else if (i < s.length() - 1 && s.charAt(i) == 'I' && s.charAt(i+1) == 'X') {
                count += 9;
                i++;
            } else if (i < s.length() - 1 && s.charAt(i) == 'X' && s.charAt(i+1) == 'L') {
                count += 40;
                i++;
            } else if (i < s.length() - 1 && s.charAt(i) == 'X' && s.charAt(i+1) == 'C') {
                count += 90;
                i++;
            } else if (i < s.length() - 1 && s.charAt(i) == 'C' && s.charAt(i+1) == 'D') {
                count += 400;
                i++;
            } else if (i < s.length() - 1 && s.charAt(i) == 'C' && s.charAt(i+1) == 'M') {
                count += 900;
                i++;
            } else if (s.charAt(i) == 'M') {
                count += 1000;
            } else if (s.charAt(i) == 'D') {
                count += 500;
            } else if (s.charAt(i) == 'C') {
                count += 100;
            } else if (s.charAt(i) == 'L') {
                count += 50;
            } else if (s.charAt(i) == 'X') {
                count += 10;
            } else if (s.charAt(i) == 'V') {
                count += 5;
            } else if (s.charAt(i) == 'I') {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3, 4};
        int[] index = new int[]{0, 1, 2, 2, 1};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));

        int x = -1234;
        int y = 1234321;

        System.out.println(reverse(x));

        System.out.println(isPalindrome(y));

        String s = "MCMXCIV";

        System.out.println(romanToInt(s));

    }
}
