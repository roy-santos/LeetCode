package easy;

import java.util.Arrays;

public class ShuffleTheArray {

    static int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[2 * n];

        int index = 0;
        int p1 = 0;
        int p2 = n;

        while (index < 2 * n) {
            shuffled[index] = nums[p1];
            shuffled[index+1] = nums[p2];
            index += 2;
            p1++;
            p2++;
        }
        return shuffled;
    }

    public static void main(String[] args) {

        int[] array = new int[]{2, 5, 1, 3, 4, 7};
        int n = 3;

        System.out.println(Arrays.toString(shuffle(array, n)));
    }
}
