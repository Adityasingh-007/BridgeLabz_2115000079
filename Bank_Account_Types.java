class BankAccount {
    int accountNumber;
    int balance;

    BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    int interestRate;

    SavingsAccount(int accountNumber, int balance, int interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account with Interest Rate: " + interestRate);
    }
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    CheckingAccount(int accountNumber, int balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account with Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int tenure;

    FixedDepositAccount(int accountNumber, int balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account with Tenure: " + tenure);
    }
}

public class Bank_Account_Types {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(123, 5000, 5);
        CheckingAccount c = new CheckingAccount(124, 2000, 1000);
        FixedDepositAccount f = new FixedDepositAccount(125, 10000, 3);

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}