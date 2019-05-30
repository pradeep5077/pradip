import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {


        inputThemPrintSumAndAverage();
    }

    public static void inputThemPrintSumAndAverage() {
        int sum = 0;
        int n = 100;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number ");
        int[] arr = new int[n];
        int i = 0;
        while (s1.hasNextInt()) {


            arr[i++] = s1.nextInt();

        }
        if (i != 0) {
            for (int j = 0; j < i; j++) {


                sum = sum + arr[j];

            }
            int avg = sum / i;
            System.out.println("SUM = " + sum + " AVG =" + avg);

        } else {
            System.out.println("SUM = 0 AVG =0");
        }


    }
}