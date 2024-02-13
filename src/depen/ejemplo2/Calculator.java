package depen.ejemplo2;

public class Calculator {

    private Operation operation; // Dependency on the Operation class

    public Calculator() {
        this.operation = new Operation(); // Creating an Operation object
    }

    public int sum(int a, int b) {
        operation.setOperationType("+"); // Sets the operation type
        operation.setValue1(a); // Sets the first value
        operation.setValue2(b); // Sets the second value
        return operation.calculate(); // Invokes the "calculate()" method of the Operation class
    }

    public int subtract(int a, int b) {
        operation.setOperationType("-"); // Sets the operation type
        operation.setValue1(a); // Sets the first value
        operation.setValue2(b); // Sets the second value
        return operation.calculate(); // Invokes the "calculate()" method of the Operation class
    }

    public int multiply(int a, int b) {
        operation.setOperationType("*"); // Sets the operation type
        operation.setValue1(a); // Sets the first value
        operation.setValue2(b); // Sets the second value
        return operation.calculate(); // Invokes the "calculate()" method of the Operation class
    }

    public int divide(int a, int b) {
        operation.setOperationType("/"); // Sets the operation type
        operation.setValue1(a); // Sets the first value
        operation.setValue2(b); // Sets the second value
        return operation.calculate(); // Invokes the "calculate()" method of the Operation class
    }
}
