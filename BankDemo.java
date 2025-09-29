package banking;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("12204789", "John Cena", 23000.00);
        System.out.println("Welcome to the Banking App!");
        int choice = 0;
        do {
            System.out.println("\n Banking Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:System.out.print("Enter deposit amount: ");
                     double depositAmount = scanner.nextDouble();
                     account.deposit(depositAmount);
                     account.showBalance();
                     break;
                    case 2:System.out.print("Enter withdrawal amount: ");
                     double withdrawAmount = scanner.nextDouble();
                     account.withdraw(withdrawAmount);
                     account.showBalance();
                     break;
                    case 3:account.showBalance();
                     break;
                    case 4:System.out.println("Thank you for using the banking app. Goodbye!");
                     break;
                    default:System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                } 
            } catch (InputMismatchException e) {
                System.out.println("\nERROR: Invalid input. Please enter a valid number.");
                scanner.nextLine();
                choice = 0;
            } catch (ArithmeticException | InsufficientBalanceException e) {
                System.out.println("\nTRANSACTION FAILED: " + e.getMessage());
                account.showBalance();
            }

        } while (choice != 4);

scanner.close();
    }
}