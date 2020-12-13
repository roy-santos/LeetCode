package easy.Random_Problems;

public class NumberOfStepsToReduceANumberToZero {

    static int numberOfSteps (int num) {

        int numMoves = 0;

        while (num > 0) {
            num = num % 2 == 0 ? num/2 : --num;
            ++numMoves;
        }

        return numMoves;

    }

    public static void main (String[] args) {

        int num = 14;

        System.out.println(numberOfSteps(num));
    }
}
