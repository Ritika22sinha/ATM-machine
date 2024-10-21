import java.util.Scanner;

public class ATM_Machine {
    static int correctPin = 3214;
    static double userBalance = 5000;
    static double atmTotalBalance = 50000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for PIN
        if (checkPin(sc)) {
            System.out.println("Correct PIN entered.");

            // Ask user for withdrawal or deposit choice
            System.out.println("Choose an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            int option = sc.nextInt();

            if (option == 1) {
                withdrawAmount(sc); // Handle withdrawal
            } else if (option == 2) {
                depositAmount(sc); // Handle deposit
            } else {
                System.out.println("Invalid option selected.");
            }
        } else {
            System.out.println("Incorrect PIN, please try again.");
        }
    }

    // Check if PIN is correct
    public static boolean checkPin(Scanner sc) {
        System.out.print("Enter your ATM PIN: ");
        if (sc.hasNextInt()) {
            int enteredPin = sc.nextInt();
            return enteredPin == correctPin;
        } else {
            return false; // Return false if input is not an integer
        }
    }

    // Handle withdrawal operation
    public static void withdrawAmount(Scanner sc) {
        System.out.print("Enter the amount to withdraw: ");
        if (sc.hasNextInt()) {
            int withdrawalAmount = sc.nextInt();

            // Check if withdrawal amount is valid
            if (canWithdraw(withdrawalAmount)) {
                processTransaction(withdrawalAmount); // Process the withdrawal
            } else {
                System.out.println("Insufficient funds in your account or ATM.");
            }
        } else {
            System.out.println("Invalid amount entered. Please enter a number.");
        }
    }

    // Handle deposit operation
    public static void depositAmount(Scanner sc) {
        System.out.print("Enter the amount to deposit (max 50000): ");
        if (sc.hasNextInt()) {
            int depositAmount = sc.nextInt();

            // Check if deposit amount is valid
            if (depositAmount <= 50000) {
                userBalance += depositAmount; // Add deposit to user's balance
                atmTotalBalance += depositAmount; // Add deposit to ATM balance
                System.out.println("Deposit successful.");
                System.out.println("Your updated balance: " + userBalance);
                System.out.println("ATM total balance: " + atmTotalBalance);
            } else {
                System.out.println("Deposit amount exceeds the maximum limit.");
            }
        } else {
            System.out.println("Invalid amount entered. Please enter a number.");
        }
    }

    // Check if the user can withdraw the requested amount
    public static boolean canWithdraw(int withdrawalAmount) {
        return withdrawalAmount <= userBalance && withdrawalAmount <= atmTotalBalance;
    }

    // Process the withdrawal transaction
    public static void processTransaction(int withdrawalAmount) {
        userBalance -= withdrawalAmount;
        atmTotalBalance -= withdrawalAmount;
        System.out.println("Withdrawal successful.");
        System.out.println("Your remaining balance: " + userBalance);
        System.out.println("ATM total balance: " + atmTotalBalance);
    }
}
