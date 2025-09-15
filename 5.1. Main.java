class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    public BankAccount(String accNumber, String accHolder, double initialBalance) {
        accountNumber = accNumber;
        accountHolder = accHolder;
        if (initialBalance >= 0)
            balance = initialBalance;
        else
            balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String newHolder) {
        if (newHolder != null && !newHolder.isEmpty()) {
            accountHolder = newHolder;
        } else {
            System.out.println("Invalid account holder name!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            System.out.println("Withdrawal amount must be positive!");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC1001", "John Doe", 5000);
        BankAccount acc2 = new BankAccount("ACC2002", "Alice Smith", 10000);

        System.out.println("=== Account 1 Details ===");
        acc1.displayDetails();

        System.out.println("\n=== Account 2 Details ===");
        acc2.displayDetails();

        System.out.println("\n--- Performing Transactions ---");
        acc1.deposit(2000);
        acc1.withdraw(3000);
        acc2.withdraw(15000); // Should show insufficient balance

        System.out.println("\n=== Updated Account 1 Details ===");
        acc1.displayDetails();

        System.out.println("\nChanging Account Holder Name for Account 2...");
        acc2.setAccountHolder("Alice Johnson");
        acc2.displayDetails();
    }
}
