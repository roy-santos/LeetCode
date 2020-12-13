package easy.Random_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int mostCandies = Arrays.stream(candies).max().getAsInt();
        List<Boolean> canBeTheMost = new ArrayList<Boolean>();

        for (int i=0; i<candies.length; i++) {
            if(candies[i] + extraCandies >= mostCandies) {
                canBeTheMost.add(true);
            }  else {
                canBeTheMost.add(false);
            }
        }
        return canBeTheMost;
    }

    public static void main(String[] args) {

        int[] array = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(array, extraCandies));
    }

}
