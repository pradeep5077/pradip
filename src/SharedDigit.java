import java.util.Scanner;

public class SharedDigit {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number1 = s1.nextInt();
        int number2 = s1.nextInt();
        hasSharedDigit(number1, number2);
    }

    private static boolean hasSharedDigit(int number1, int number2) {
        int num , num1;
        while ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {
             num = number1 % 10;
            number1 = number1 / 10;
             num1 = number2 % 10;
            number2 = number2 / 10;
            if (number1 == number2 && number2 == num1 && num1 == num)
                System.out.println(true);
            }
        return false;
    }
}
