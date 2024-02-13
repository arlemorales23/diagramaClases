package depen.ejemplo2;

public class Operation {

    private String operationType;
    private int value1;
    private int value2;

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int calculate() {
        int result = 0;
        switch (operationType) {
            case "+":
                result = value1 + value2;
                break;
            case "-":
                result = value1 - value2;
                break;
            case "*":
                result = value1 * value2;
                break;
            case "/":
                result = value1 / value2;
                break;
        }
        return result;
    }
}
