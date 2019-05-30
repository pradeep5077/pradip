public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (width < 0 || length < 0) {
            this.width = 0;
            this.length = 0;
        }
        this.width = width;
        this.length = length;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        double area;
        area = (getWidth() * getLength());
        return area;
    }
}

class Cuboid extends Rectangle {
    public double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        }
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }


    public double getVolume() {
        return (getArea() * getHeight());

    }

}
