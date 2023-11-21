public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return  this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double real, double imaginary) {
        this.real = this.real + real;
        this.imaginary = this.real + imaginary;
    }

    public void add(ComplexNumber complexNumber) {
        add(complexNumber.real, complexNumber.imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }

    public void subtract(ComplexNumber complexNumber) {
        add(complexNumber.real, complexNumber.imaginary);
    }

}
