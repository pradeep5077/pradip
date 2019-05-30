import java.util.Scanner;

public class PaintJob {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number");
        double width = s1.nextDouble();
        double height = s1.nextDouble();
        double areaPerBucket = s1.nextDouble();
        int extraPerBucket = s1.nextInt();

        System.out.println(getBucketCount(width, height, areaPerBucket, extraPerBucket));
        System.out.println(getBucketCount(width, height, areaPerBucket));
        double area = s1.nextDouble();
        System.out.println(getBucketCount(area, areaPerBucket));
    }

    public static double getBucketCount(double width, double height, double areaPerBucket, int extraPerBucket) {
        double k;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraPerBucket < 0) {
            return -1;

        } else {
            double area = width * height;
            double j = areaPerBucket * extraPerBucket;
            k = (area - j) / areaPerBucket;
            Math.ceil(k);

        }
        return Math.ceil(k);

    }

    public static double getBucketCount(double width, double height, double areaPerBucket) {
        double t;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;

        }
        double area = width * height;
        t = area / areaPerBucket;
        Math.ceil(t);
        return Math.ceil(t);
    }

    public static double getBucketCount(double area, double areaPerBucket) {
        double t;
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        t = area / areaPerBucket;
        Math.ceil(t);
        return Math.ceil(t);
    }
}