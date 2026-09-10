package ex02.entities;

public class PessoaFisica extends Pessoa {
    private Double healthcareSpending;

    public PessoaFisica() {
    }

    public PessoaFisica(String name, Double annualIncome, Double healthcareSpending) {
        super(name, annualIncome);
        this.healthcareSpending = healthcareSpending;
    }

    @Override
    public double totalTaxes() {
        double taxWithoutSpending;
        if (annualIncome < 20000.0) {
            taxWithoutSpending = annualIncome * 0.15;
        } else {
            taxWithoutSpending = annualIncome * 0.25;
        }

        if (healthcareSpending > 0.0) {
            taxWithoutSpending -= (healthcareSpending / 2);
        }

        return taxWithoutSpending;
    }

    public Double getHealthcareSpending() {
        return healthcareSpending;
    }

    public void setHealthcareSpending(Double healthcareSpending) {
        this.healthcareSpending = healthcareSpending;
    }
}
