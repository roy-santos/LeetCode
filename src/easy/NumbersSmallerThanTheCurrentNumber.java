package easy;

import java.util.Arrays;

public class NumbersSmallerThanTheCurrentNumber {
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] frequency = new int[101];

        for (int num : nums) {
            frequency[num]++;
        }
        for (int i=1; i<101; i++) {
            frequency[i] += frequency[i-1];
        }
        for (int i=0; i<nums.length; i++) {
            int index = nums[i];
            nums[i] = frequency[index-1];
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{8, 1, 2, 2, 3};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
