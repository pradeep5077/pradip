public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }

    private double getReal() {
        return real;
    }

    private double getImaginary() {
        return imaginary;
    }

    private void add(double real, double imaginary) {
        this.real = real + this.real;
        this.imaginary = imaginary + this.imaginary;


    }

    public double add(ComplexNumber complexNumber) {
        return getReal() + getImaginary();
    }

    private void subtract(double real, double imaginary) {
        this.real = real - this.real;
        this.imaginary = imaginary - this.imaginary;
    }

    private void subtract(ComplexNumber complexNumber) {
        this.real = this.real - complexNumber.getReal();
        this.imaginary = this.imaginary - complexNumber.getImaginary();
    }
}


