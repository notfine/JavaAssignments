public class SmallestNumber {
    public static void main(String[] args) {
        System.out.println("The smallest number among 100, 555, and 9 is: " + smallest(100, 555, 9));
    }

    static int smallest(int a, int b, int c) {
        int check;
        if (a < b) {
            if (c < a) {
                check = c;
            } else {
                check = a;
            }
        } else {
            if (b < c) {
                check = b;
            } else {
                check = c;
            }
        }
        return check;
    }

}
