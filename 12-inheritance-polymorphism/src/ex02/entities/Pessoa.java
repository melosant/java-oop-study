package ex02.entities;

public abstract class Pessoa {
    protected String name;
    protected Double annualIncome;

    public Pessoa() {
    }

    public Pessoa(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public abstract double totalTaxes();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }
}
