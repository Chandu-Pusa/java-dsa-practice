package oops;

class BankAccount{
    String owner;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println(owner + " deposited " + amount);
    }
}

public class Class {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.owner = "Sara";
        account1.balance = 1000;
        account1.deposit(500);
        System.out.println("Balance: " + account1.balance);
    }
}
