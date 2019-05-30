public class Floor {
    public double width;
    public double length;

    public Floor(double width, double length) {
        if (width < 0 || length < 0) {
            this.width = 0;
            this.length = 0;
        } else {
            this.width = width;
            this.length = length;
        }


    }

    public static void main(String[] args) {

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

    }

    public double getArea() {
        double sum = width * length;
        return sum;
    }

}

class Carpet {
    public double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        }
        this.cost = cost;
    }

    private double getCost() {
        return cost;

    }
}

class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }


    public double getTotalCost() {
        return floor.getArea() * carpet.cost;
    }


}

