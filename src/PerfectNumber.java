import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = s1.nextInt();
        System.out.println(isPerfectNumber(number));
    }

    private static boolean isPerfectNumber(int number) {
        int i;
        int sum = 0;
        if (number < 1)
            return false;
        for (i = 1; i < number; i++)
            if (number % i == 0) {
                sum = sum + i;
            } else if (sum == number) {
                return true;
            }
        return false;
    }
}
