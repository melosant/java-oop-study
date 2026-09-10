package fundamentos.sistema_bancario;

public class ContaCorrente {
    public String cpf;
    public String nomeCompleto;
    public double saldo;

    public ContaCorrente(String cpf, String nomeCompleto) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo Insuficiante!");
            return;
        };

        saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Precisa Depositar um Valor Maior que R$0,00!");
            return;
        }

        saldo += valor;
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        if (valor > saldo) {
            System.out.println("Saldo Insuficiente!");
            return;
        }

        contaDestino.depositar(valor);
        saldo -= valor;
    }

    public double verSaldo() {
        return saldo;
    }
}
