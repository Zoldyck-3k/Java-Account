package com.mycompany.account;

import java.util.*;

public class account {
    String name, accountnum;
    double balance;

    int option;
    double deposit, withdraw;

    Scanner sc = new Scanner(System.in);

    void getdata() {
        System.out.print("Enter name of customer: ");
        name = sc.nextLine();
        System.out.print("account number: ");
        accountnum = sc.nextLine();
        System.out.print("Balance Amount: ");
        balance = sc.nextDouble();
    }

    void deposit() {
        System.out.print("Enter Amount to deposit: ");
        deposit = sc.nextDouble();
        balance = balance + deposit;
    }

    void withdraw() {
        System.out.print("Enter Amount to withdraw: ");
        withdraw = sc.nextDouble();
        balance -= withdraw;
    }

    void option() {
        System.out.println("Enter 1 for Deposite");
        System.out.println("Enter 2 for Withdraw");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;
            default:
                System.out.println("Wrong Choice");
                option();
                break;
        }
        sc.close();
    }

    void display() {
        System.out.println();
        System.out.println("Name of Depositor: " + name);
        System.out.println("account Number: " + accountnum);
        System.out.println("Balance Amount: " + balance);
    }
}