import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask user to input two numbers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        
        // Add the two numbers and display the result
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
    }
}
