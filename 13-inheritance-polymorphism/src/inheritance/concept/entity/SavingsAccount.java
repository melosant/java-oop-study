package inheritance.concept.entity;

// a palavra final dita que essa classe não pode ser herdada
public final class SavingsAccount extends Account{
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

    @Override // boa prática para informar o compilador que é para sobrescrita. (melhora legibilidade)
    public void withdraw(double amount) {
        balance -= amount;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
