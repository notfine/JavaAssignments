public class AverageArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 5, 10, 15, 20, 25 };
        int sum = 0;
        double avg;
        for (int i = 0; i < arr.length; i++) {
            sum = (sum + arr[i]);
        }
        avg = sum / arr.length;
        System.out.println("The average of the given array is:" + avg);
    }
}
