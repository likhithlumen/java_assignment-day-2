@FunctionalInterface
interface MathOperation {
    int apply(int a, int b);
}

public class program7 {
    public static void main(String[] args) {
        // Create a lambda expression for the sum operation
        MathOperation sum = (a, b) -> a + b;

        int num1 = 5;
        int num2 = 10;
        int result = sum.apply(num1, num2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is " + result);
    }
}
