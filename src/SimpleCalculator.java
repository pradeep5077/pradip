public class SimpleCalculator {
    private double firstnumber;
    private double secondnumber;

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }

    private double getFirstNumber() {

        return firstnumber;
    }

    private void setFirstNumber(double firstnumber) {

        this.firstnumber = firstnumber;
    }

    private double getSecondNumber() {

        return secondnumber;
    }

    private void setSecondNumber(double secondnumber) {

        this.secondnumber = secondnumber;
    }

    private double getAdditionResult() {
        return getFirstNumber() + getSecondNumber();
    }

    private double getSubtractionResult() {
        return getFirstNumber() - getSecondNumber();
    }

    private double getMultiplicationResult() {
        return firstnumber * secondnumber;
    }

    private double getDivisionResult() {
        return secondnumber / firstnumber;
    }
}
