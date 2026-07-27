package inheritance.concept.entity;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(String holder, Integer number, Double balance, Double interestRate) {
        super(holder, number, balance);
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
