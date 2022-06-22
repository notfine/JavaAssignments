public class EvenOrOdd {
    public static void main(String[] args) {
        CheckNumber(15);
    }

    static void CheckNumber(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
