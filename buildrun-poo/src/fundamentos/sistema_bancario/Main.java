package fundamentos.sistema_bancario;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("111.111.111-11", "Fulano de tal");
        conta1.depositar(100);
        conta1.sacar(50);
        System.out.println("Saldo Atual: " + String.format("%.2f", conta1.verSaldo()));


        ContaCorrente conta2 = new ContaCorrente("222.222.222-22", "Ciclano");
        conta1.transferir(conta2, 60);
        conta1.transferir(conta2, 40);
        System.out.println("Saldo Atual: " + String.format("%.2f", conta1.verSaldo()));
        System.out.println("Saldo Atual: " + String.format("%.2f", conta2.verSaldo()));

    }
}
