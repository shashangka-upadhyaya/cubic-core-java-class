package Lab1.task;
import java.util.*;

public class BankLab {

    public static void main(String[] args) {
        // Creating bank accounts using both constructors
        BankAccount acc1 = new BankAccount("Alice", 1000.0);
        BankAccount acc2 = new BankAccount("Bob");

        // Depositing funds (simple and with interest)
        acc1.deposit(500);
        acc1.deposit(200, 5); // 5% interest

        // Withdrawing funds (simple and with fee)
        acc1.withdraw(300);
        acc1.withdraw(100, 10); // $10 fee

        // Testing on second account
        acc2.deposit(1000);
        acc2.withdraw(200);
        acc2.deposit(500, 10);  // 10% interest
        acc2.withdraw(100, 5);  // $5 fee
    }
}

class BankAccount {
    private static int nextAccountNumber = 1000;
    private int accountNumber;
    private String name;
    private double balance;

    // Constructor with name and balance
    public BankAccount(String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
        this.accountNumber = ++nextAccountNumber;
        display();
    }

    // Constructor with name only
    public BankAccount(String name) {
        this(name, 0.0);
    }

    // Deposit without interest
    public void deposit(double amount) {
        balance += amount;
        display();
    }

    // Overloaded deposit with interest
    public void deposit(double amount, double interestPercent) {
        balance += amount;
        balance += balance * (interestPercent / 100);
        display();
    }

    // Withdraw without fee
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
        display();
    }

    // Overloaded withdraw with fee
    public void withdraw(double amount, double fee) {
        double total = amount + fee;
        if (total <= balance) {
            balance -= total;
        } else {
            System.out.println("Insufficient funds.");
        }
        display();
    }

    // Display account info
    public void display() {
        System.out.printf("Account Number: %d | Name: %s | Balance: $%.2f%n", accountNumber, name, balance);
    }
}



