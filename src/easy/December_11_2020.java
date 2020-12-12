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

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 3, 4};
        int[] index = new int[]{0, 1, 2, 2, 1};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));

        int x = -1234;
        int y = 1234321;

        System.out.println(reverse(x));

        System.out.println(isPalindrome(y));

    }
}
