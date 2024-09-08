// package banking;

import java.util.Scanner;


class Bank {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public void addAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder name: ");
        accountHolder = sc.nextLine();
        System.out.print("Enter balance: ");
        balance = sc.nextDouble();
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int acc = sc.nextInt();
        if (acc == accountNumber) {
            System.out.print("Enter amount to deposit: ");
            double amount = sc.nextDouble();
            balance += amount;
            System.out.println("Amount deposited successfully");
        } else {
            System.out.println("Account not found");
        }
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int acc = sc.nextInt();
        if (acc == accountNumber) {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Amount withdrawn successfully");
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Account not found");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}


/**
 * Banking
 */
public class Banking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;
        do {
            System.out.println("1. Add Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bank.addAccount();
                    break;
                case 2:
                    bank.deposit();
                    break;
                case 3:
                    bank.withdraw();
                    break;
                case 4:
                    bank.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
        sc.close();
    }
}