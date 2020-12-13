package easy.Random_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class DefangingIPAddress {

    static String defangIPaddr(String address) {
        char[] splitAddress = address.toCharArray();

        ArrayList<Character> defangedAddress = new ArrayList<>();

        for (int i=0; i<splitAddress.length; i++) {
            if (splitAddress[i] == '.') {
                defangedAddress.add('[');
                defangedAddress.add('.');
                defangedAddress.add(']');
            } else {
                defangedAddress.add(splitAddress[i]);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<defangedAddress.size(); i++) {
            sb.append(defangedAddress.get(i));
        }

        String result = sb.toString();

        return result;
    }

    public static void main(String[] args) {

        String stringInput = "1.1.1.1";

        System.out.println(defangIPaddr(stringInput));
    }
}
