package easy;

public class December_7_2020 {
    static int subtractProductAndSum(int n) {
        int product = 1, sum = 0;

        while (n > 0) {
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        int input = 4421;

        System.out.println(subtractProductAndSum(input));
    }
}
