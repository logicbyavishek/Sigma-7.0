import java.util.*;

/**
 * Main class to get user input and perform complex number operations.
 */
public class ComplexCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Input for the first complex number ---
        System.out.println("Enter the first complex number:");
        System.out.print("Real part: ");
        double real1 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imag1 = scanner.nextDouble();
        Complex c1 = new Complex(real1, imag1);

        // --- Input for the second complex number ---
        System.out.println("\nEnter the second complex number:");
        System.out.print("Real part: ");
        double real2 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imag2 = scanner.nextDouble();
        Complex c2 = new Complex(real2, imag2);

        // --- Perform operations ---
        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);

        // --- Display results ---
        System.out.println("\n-------------------------------------");
        System.out.println("Sum: (" + c1 + ") + (" + c2 + ") = " + sum);
        System.out.println("Difference: (" + c1 + ") - (" + c2 + ") = " + difference);
        System.out.println("Product: (" + c1 + ") * (" + c2 + ") = " + product);
        System.out.println("-------------------------------------");

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}

/**
 * A class to represent a complex number with real and imaginary parts.
 * It includes methods for addition, subtraction, and multiplication.
 */
class Complex {
    double real;
    double imag;

    // Constructor to initialize the complex number
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add another complex number to this one
    public Complex add(Complex other) {
        double resultReal = this.real + other.real;
        double resultImag = this.imag + other.imag;
        return new Complex(resultReal, resultImag);
    }

    // Method to subtract another complex number from this one
    public Complex subtract(Complex other) {
        double resultReal = this.real - other.real;
        double resultImag = this.imag - other.imag;
        return new Complex(resultReal, resultImag);
    }

    // Method to multiply this complex number by another one
    public Complex multiply(Complex other) {
        double resultReal = this.real * other.real - this.imag * other.imag;
        double resultImag = this.real * other.imag + this.imag * other.real;
        return new Complex(resultReal, resultImag);
    }

    // Override the default toString() method for a clean output format like "a + bi"
    @Override
    public String toString() {
        if (imag >= 0) {
            return this.real + " + " + this.imag + "i";
        } else {
            return this.real + " - " + (-this.imag) + "i";
        }
    }
}