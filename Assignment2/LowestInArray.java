public class LowestInArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 10, 5, 25, 15, 20 };
        int smallest = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("The smallest element in array: " + smallest);
    }
}
