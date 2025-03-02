public class program10 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
