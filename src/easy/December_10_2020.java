package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class December_10_2020 {
    static int[] decompressRLElist(int[] nums) {
        int arraySize = 0;

        for (int i=0; i<nums.length; i+=2) {
            arraySize += nums[i];
        }

        int[] result = new int[arraySize];

        int freq = 0;
        int freqIndex = 0;
        int resultIndex = 0;

        while (resultIndex < arraySize) {
            if (freq == nums[freqIndex*2]) {
                freqIndex++;
                freq = 0;
            }
            result[resultIndex] = nums[freqIndex*2+1];
            freq++;
            resultIndex++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4};

        System.out.println(Arrays.toString(decompressRLElist(input)));
    }
}
