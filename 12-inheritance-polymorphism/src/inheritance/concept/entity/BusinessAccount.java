package inheritance.concept.entity;

public class BusinessAccount extends Account { // a classe extende a superclasse (herda)
    private Double loanLimit;

    public BusinessAccount() {
        super(); // chama o construtor da superclasse sem args (caso haja lógica)
    }

    public BusinessAccount(String holder, Integer number, Double balance, Double loanLimit) {
        super(holder, number, balance); // chama o construtor da superclasse com 3 args
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
