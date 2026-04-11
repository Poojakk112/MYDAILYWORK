// Project: ATM Interface System

// Description:
// This program simulates an ATM machine where users can perform
// basic banking operations like withdraw, deposit, and check balance.

// Features:
// - Balance Inquiry
// - Cash Withdrawal
// - Deposit Money
// - Exit

// Technologies Used:
// Java, Scanner, Loops, Conditional Statements

import java.util.Scanner;

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Please collect your cash.");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(10000); // Initial balance

        int choice;

        System.out.println("===== Welcome to ATM System =====");

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
