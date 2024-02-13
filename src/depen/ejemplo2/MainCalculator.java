package depen.ejemplo2;

public class MainCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.sum(10, 5);
        System.out.println("Sum: " + sum); // Prints the sum result

        int difference = calculator.subtract(10, 5);
        System.out.println("Difference: " + difference); // Prints the difference result

        int product = calculator.multiply(10, 5);
        System.out.println("Product: " + product); // Prints the product result

        int quotient = calculator.divide(10, 5);
        System.out.println("Quotient: " + quotient); // Prints the quotient result
    }
}
