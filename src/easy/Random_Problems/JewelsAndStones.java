package easy.Random_Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JewelsAndStones {
    static int numJewelsInStones(String J, String S) {
        int jewelCount = 0;

        Set<Character> validJewels = new HashSet<>();

        for (char c : J.toCharArray()) {
            validJewels.add(c);
        }

        for (char c : S.toCharArray()) {
            if (validJewels.contains(c)) {
                jewelCount+= 1;
            }
        }

        return jewelCount;
    }

    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(numJewelsInStones(jewels, stones));
    }
}
