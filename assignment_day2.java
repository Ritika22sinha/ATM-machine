import java.util.Scanner;

public class assignment_day2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        // Task 4: Use while loop with Scanner class to read user input until 'exit'
        System.out.println("This program will demonstrate the use of 'break' and 'continue' statements.");
        System.out.println("Type 'exit' at any point to quit.");
        
        while (true) {
            System.out.print("Enter a command (type 'exit' to quit): ");
            input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break; // Break the loop when user types 'exit'
            }
            
            System.out.println("You entered: " + input);
        }

        // Task 5: Demonstrating break and continue within loops
        
        // Using break in a for loop (Example: Stop loop when i equals 5)
        System.out.println("\nFor loop demonstration with break (stops at 5):");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exits the loop when i equals 5
            }
            System.out.println("i = " + i);
        }

        // Using continue in a for loop (Example: Skip even numbers)
        System.out.println("\nFor loop demonstration with continue (skips even numbers):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Skipping i = " + i); // Inform user about skipping
                continue; // Skips the iteration for even numbers
            }
            System.out.println("i = " + i); // Only odd numbers will be printed
        }

        // Using continue in a while loop (Example: Skip even numbers)
        System.out.println("\nWhile loop demonstration with continue (skips even numbers):");
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                System.out.println("Skipping i = " + i); // Inform user about skipping
                continue; // Skips the iteration for even numbers
            }
            System.out.println("i = " + i); // Only odd numbers will be printed
        }
        
        System.out.println("Program terminated.");
        scanner.close();
    }
}