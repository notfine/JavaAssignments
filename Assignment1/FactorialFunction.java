public class FactorialFunction {
    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + factorial(5));
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
