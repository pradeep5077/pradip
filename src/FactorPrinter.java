import java.util.Scanner;

public class FactorPrinter {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = s1.nextInt();
        if(number < 1)
            System.out.println("Invalid value");

        else
            printfactors(number);
    }

    public static void printfactors(int number) {
            for (int i =1; i <= number; i ++ ) {
                int rem = number % i;
                if (rem == 0 )
                    System.out.println(i);
            }
    }
}
