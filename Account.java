package banking;
public class Account {
    private String accountNo;
    private String name;
    private double balance;
    public Account(String accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("SUCCESS: $" + amount + " deposited.");
        } else {
            System.out.println("ERROR: Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) throws InsufficientBalanceException, ArithmeticException {
        if (amount < 0) {
            throw new ArithmeticException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance. Available: $" + balance + ", Requested: $" + amount
            );
        }
        balance -= amount;
        System.out.println("SUCCESS: $" + amount + " withdrawn.");
    }
    public void showBalance() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNo);
        System.out.printf("Current Balance: $%.2f%n", balance);
    }
}