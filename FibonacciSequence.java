import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of terms to be generated
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int n = scanner.nextInt();

        // Create an array to store Fibonacci numbers
        int[] fibonacci = new int[n];

        // Check if the input is valid
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Generate the Fibonacci sequence and store it in the array
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    fibonacci[i] = 0;
                } else if (i == 1) {
                    fibonacci[i] = 1;
                } else {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }
            }

            // Print the Fibonacci sequence
            System.out.print("Fibonacci sequence: ");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci[i] + " ");
            }
        }

        scanner.close(); // Close the scanner
    }
}

