import java.util.Scanner;

public class words {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = s1.nextInt();
        getDigitCount(number);
        reverse(number);
    }

    public static void numberToWords(int tp) {

        switch (tp) {

            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }
    }

    public static void reverse(int number) {
        int temp;
        int reversednumber = 0;
        while (number != 0) {
            temp = number % 10;

            reversednumber = reversednumber * 10 + temp;
            number = number / 10;
        }
        System.out.println(reversednumber);
        int temps = reversednumber;
        while (reversednumber != 0) {

            int tp = temps % 10;
            numberToWords(tp);
            temps = temps / 10;
        }
    }

    public static int getDigitCount(int number) {
        int count = 0;
        while (number != 0) {

            number = number / 10;
            count = count + 1;
        }
        System.out.println(count);
        int i = -1;
        return i;
    }
}






