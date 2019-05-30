import java.util.Scanner;

public class LargestPrime {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = s1.nextInt();
        int t;
        if (number <= 0) {
            t = -1;
            System.out.println(t);
        } else {
            System.out.println(getLargestPrime(number));
        }
    }

    public static int getLargestPrime(int number) {
        int i;
        int Bigprime;
        Bigprime = 0;
        for (i = 2; i <= number; i++) {
            if (number % i == 0 && isPrime(i)) {
                Bigprime = i;
            }
        }
        return Bigprime;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


}

