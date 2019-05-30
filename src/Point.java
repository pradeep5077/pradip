public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance(0)= " + point.distance());

    }

    private int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private double distance() {
        return Math.sqrt((this.x - 0) * (this.x - 0) + (this.y - 0) * (this.y - 0));
    }

    private double distance(int x, int y) {

        double value = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
        return value;
    }

    private double distance(Point p) {
        double value = Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
        return value;
    }
}
