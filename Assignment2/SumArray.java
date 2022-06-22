public class SumArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 5, 10, 15, 20, 25 };
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of all elements of the array are: " + sum);
    }
}