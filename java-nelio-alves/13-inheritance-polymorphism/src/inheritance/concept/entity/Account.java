package inheritance.concept.entity;

public class Account {
    private String holder;
    private Integer number;
    protected Double balance; // permitir acesso direto da subclasse

    public Account() {
    }

    public Account(String holder, Integer number, Double balance) {
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }
}
