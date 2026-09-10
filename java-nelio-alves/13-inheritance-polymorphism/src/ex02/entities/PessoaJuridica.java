package ex02.entities;

public class PessoaJuridica extends Pessoa {
    private int employeesQuantity;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String name, Double annualIncome, int employeesQuantity) {
        super(name, annualIncome);
        this.employeesQuantity = employeesQuantity;
    }

    @Override
    public double totalTaxes() {
        double taxWithoutSpending;
        if (employeesQuantity > 10) {
            taxWithoutSpending = annualIncome * 0.14;
        } else {
            taxWithoutSpending = annualIncome * 0.16;
        }

        return taxWithoutSpending;
    }

    public int getEmployeesQuantity() {
        return employeesQuantity;
    }

    public void setEmployeesQuantity(int employeesQuantity) {
        this.employeesQuantity = employeesQuantity;
    }
}
