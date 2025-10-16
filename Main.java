package arithmetic;

public class Main {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        Calculator calc = new Calculator();

        System.out.println("=== Arithmetic Operations Using Enum ===");
        for (Operation op : Operation.values()) {
            try {
                double result = calc.calculate(op, a, b);
                System.out.printf("%s of %.2f and %.2f = %.2f%n", op, a, b, result);
            } catch (ArithmeticException ex) {
                System.out.printf("%s: %s%n", op, ex.getMessage());
            }
        }
    }
}
