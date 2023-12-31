package com.example;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        // TODO: Initialize the balance
        this.balance = balance;
    }

    public void deposit(double amount) {
        // TODO: Increase the balance by the value of the amount parameter
        this.balance += amount;
    }

    public void withdraw(double amount) {
        // TODO: Decrease the balance by the value of the amount parameter. 
        // Ensure that the balance does not become negative.
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Cannot withdraw");
        }

    }

    public double getBalance() {
        // TODO: Return the current balance
        return this.balance;  // Change this default return statement
    }
}
