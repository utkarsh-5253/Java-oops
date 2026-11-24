class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    // Constructor to initialize account details
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit money into the account
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Please enter a valid amount.");
        }
    }

    // Withdraw money from the account
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Please enter a valid amount.");
        } else if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display current balance
    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Display account details
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
