package easy;

public class CheckIfTwoStringArraysAreEquivalent {
     static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder concatWord1 = new StringBuilder();
        StringBuilder concatWord2 = new StringBuilder();

        for (String s : word1) {
            concatWord1.append(s);
        }

        for (String s: word2) {
            concatWord2.append(s);
        }

        if (concatWord1.toString().equals(concatWord2.toString())) {
            return true;
        }
        return false;
    }

    public static void main (String[] args) {

         String[] word1 = new String[]{"ab", "c"};
         String[] word2 = new String[]{"a", "bc"};

         System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
