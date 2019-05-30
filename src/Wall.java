public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        if (width < 0 || height < 0) {
            this.width = 0;
            this.height = 0;
        } else
            this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

    private double getWidth() {
        return width;

    }

    private void setWidth(double width) {
        if (width < 0)
            this.width = width;
    }

    private double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        if (height < 0)
            this.height = 0;
    }

    private double getArea() {
        return getWidth() * getHeight();
    }
}
