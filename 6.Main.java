class BankAccount {
    long accNum;
    double bal;

    BankAccount(long accNo, double balance) {
        this.accNum = accNo;
        this.bal = balance;
    }

    void deposit(double amt) {
        bal += amt;
        System.out.println("Deposited: " + amt + ", New Balance: " + bal);
    }

    void displayBalance() {
        System.out.println("Balance is: " + bal);
    }
}

//super calls constructer of parent class i.e BankAccount

class SavingsAcc extends BankAccount {
    SavingsAcc(long accNo, double balance) {
        super(accNo, balance);
    }

    void addInterest() {
        bal += bal * 0.05;
        System.out.println("Balance after adding interest: " + bal);
    }
}

class TransactionAcc extends SavingsAcc {
    TransactionAcc(long accNo, double balance) {
        super(accNo, balance);
    }

    void withdraw(double amt) {
        if (amt <= bal) {
            bal -= amt;
            System.out.println("Withdrew: " + amt + ", Remaining Balance: " + bal);
        } else {
            System.out.println("Insufficient balance to withdraw " + amt);
        }
    }

    @Override
    void deposit(double amt) {
        super.deposit(amt);
    }
}

class CurrentAccount extends TransactionAcc {
    CurrentAccount(long accNo, double balance) {
        super(accNo, balance);
    }

    void overDraft(double amt) {
        if (amt > bal) {
            System.out.println("Overdraft used! Withdrawn: " + amt + ", Balance now: " + (bal - amt));
            bal -= amt;
        } else {
            deposit(amt);
        }
    }
}

class LoanAccount extends BankAccount {
    LoanAccount(long accNo, double balance) {
        super(accNo, balance);
    }

    void approveLoan(long accNo, double amount) {
        if (this.accNum == accNo) {
            System.out.println("Loan approved for amount: " + amount);
        } else {
            System.out.println("Loan not approved.");
        }
    }
}

interface OnlineBanking {
    void onlineTransfer(double amt);
}

interface LoanService {
    void applyLoan(double amt);
}

class DigitalBanking extends BankAccount implements OnlineBanking, LoanService {
    DigitalBanking(long accNo, double balance) {
        super(accNo, balance);
    }

    public void onlineTransfer(double amt) {
        if (amt <= bal) {
            bal -= amt;
            System.out.println("Online transfer successful: " + amt + ", Remaining Balance: " + bal);
        } else {
            System.out.println("Online transfer failed: Insufficient balance");
        }
    }

    public void applyLoan(double amt) {
        System.out.println("Loan application submitted for amount: " + amt);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("---- Single Inheritance ----");
        SavingsAcc sa = new SavingsAcc(101, 5000);
        sa.displayBalance();
        sa.deposit(2000);
        sa.addInterest();

        System.out.println("\n---- Multilevel Inheritance ----");
        CurrentAccount ca = new CurrentAccount(201, 3000);
        ca.deposit(1500);
        ca.withdraw(4000);
        ca.overDraft(2000);

        System.out.println("\n---- Hierarchical Inheritance ----");
        LoanAccount la = new LoanAccount(301, 0);
        la.approveLoan(301, 100000);
        sa.displayBalance();

        System.out.println("\n---- Multiple Inheritance (via Interfaces) ----");
        DigitalBanking db = new DigitalBanking(401, 10000);
        db.onlineTransfer(3000);
        db.applyLoan(50000);
    }
}
