public class Main {
    public static void main(String[] args) {

        // Creating two different bank accounts
        BankAccount account1 = new BankAccount(101, "Utkarsh", 5000);
        BankAccount account2 = new BankAccount(102, "Rahul", 8000);

        // Operations on first account
        System.out.println("----- Account 1 -----");
        account1.deposit(2000);
        account1.withdraw(1000);
        account1.checkBalance();

        System.out.println();

        // Operations on second account
        System.out.println("----- Account 2 -----");
        account2.deposit(3000);
        account2.withdraw(2000);
        account2.checkBalance();

        System.out.println();

        // Displaying final details of both accounts
        System.out.println("----- Final Account Details -----");

        account1.displayDetails();

        System.out.println();

        account2.displayDetails();
    }
}
