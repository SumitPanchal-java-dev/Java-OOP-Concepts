package oop.Encapsulation;

class Account {
    private int balance;

    // Getter method
    public int getBalance() {
        return balance;
    }

    // Setter method
    public void setBalance(int balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(1000); // Setting balance
        System.out.println("Account balance: " + account.getBalance()); // Getting balance
    }
}
