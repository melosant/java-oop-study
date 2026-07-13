package exercise2.entity;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private static final double WITHDRAW_TAX = 5.00;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    @Override
    public String toString() {
        return "Account " + number +
                ", Holder: " + holder +
                ", Balance: $ " + String.format("%.2f", balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= (amount + WITHDRAW_TAX);
    }
}
