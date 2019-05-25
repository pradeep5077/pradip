import java.util.Scanner;

public class FlourPacker {
    public static final int bigBagWeight = 5;
    public static final int smallBagWeight = 1;


    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the BigCount");
        int bigcount = s1.nextInt();
        System.out.println("Enter the smallCount");
        int smallcount = s1.nextInt();
        System.out.println("Enter the goal");
        int goal = s1.nextInt();

        System.out.println(canPack(bigcount, smallcount, goal));
    }

    public static boolean canPack(int bigcount, int smallcount, int goal) {
        boolean res = false;
        int availablekg = (bigBagWeight * bigcount) + (smallBagWeight * smallcount);
        //data validation

        if (bigcount < 0 || smallcount < 0)
            return res;

        //cond 1
        if (goal > availablekg)
            return res;
        if (goal < bigBagWeight) {
            if (goal < smallcount * smallBagWeight)
                res = true;
        } else {
            int fivekg = goal / bigBagWeight;
            int onekg = goal % bigBagWeight;

            if (fivekg <= bigcount && onekg <= smallcount) {
                res = true;
            }

        }


        return res;

//neg con

    }
}