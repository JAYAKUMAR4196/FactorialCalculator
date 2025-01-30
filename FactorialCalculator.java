import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a positive integer to calculate its factorial: ");
        int number = scanner.nextInt();
 
        // Initialize factorial to 1
        long factorial = 1;

        // Calculate factorial using a for loop
        if (number >= 0) {
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by the current number
            }

            // Display the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        // Close the scanner
        scanner.close();
    }
}
