public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        }
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }

    public double getRadius() {

        return radius;
    }

    public double getArea() {
        double area;
        area = (radius * radius * Math.PI);
        return area;
    }

}

class Cylinder extends Circle {
    public double radius;
    public double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        }
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {

        return this.height;
    }

    public double getVolume() {

        return (getArea() * getHeight());
    }
}

