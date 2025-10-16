package arithmetic;

public class Calculator {

    public double calculate(Operation op, double a, double b) {
        return op.apply(a, b);
    }
}
