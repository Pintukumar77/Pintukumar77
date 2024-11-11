import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false; // Variable to check if the user wants to exit

        while (!exit) {
            // Display the menu
            System.out.println("\n--- Menu Driven Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an operation (1-5): ");
            
            int choice = scanner.nextInt(); // Take the user's choice
            
            if (choice == 5) {
                exit = true; // Exit the loop if the user chooses to exit
                System.out.println("Exiting the calculator. Goodbye!");
            } else {
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble(); // Take first number from the user
                
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble(); // Take second number from the user

                // Perform the chosen operation
                if (choice == 1) {
                    System.out.println("Result: " + (num1 + num2));
                } else if (choice == 2) {
                    System.out.println("Result: " + (num1 - num2));
                } else if (choice == 3) {
                    System.out.println("Result: " + (num1 * num2));
                } else if (choice == 4) {
                    if (num2 != 0) { // Check for division by zero
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                } else {
                    System.out.println("Invalid choice. Please choose a valid option.");
                }
            }
        }

        scanner.close(); // Close the scanner
    }
}
