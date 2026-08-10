package processamentoPagamento.application;

import processamentoPagamento.model.entities.MetodoPagamento;
import processamentoPagamento.model.entities.PagamentoBoleto;
import processamentoPagamento.model.entities.PagamentoCartaoCredito;
import processamentoPagamento.model.entities.PagamentoPix;
import processamentoPagamento.model.exceptions.PagamentoException;
import processamentoPagamento.model.services.ProcessadorPagamento;

import java.util.ArrayList;
import java.util.List;

/*
Por que MetodoPagamento é interface e não classe abstrata?
Metodo pagamento é interface pois as classes que a implementam não compartilham atributos em comum,
somente métodos (suas assinaturas).

Se todas ganhassem um idTransacao comum, isso mudaria sua resposta?
Sim, pois as classes compartilham estado real, logo é uma característica clara para uma transição para classes abstratas.
 */
public class Program {
    public static void main(String[] args) {
        List<MetodoPagamento> metodos = new ArrayList<>();
        metodos.add(new PagamentoCartaoCredito("1028", 300.0));
        metodos.add(new PagamentoCartaoCredito("2028", 100.0));
        metodos.add(new PagamentoBoleto(5));
        metodos.add(new PagamentoBoleto(0));
        metodos.add(new PagamentoPix("maria@gmail.com"));

        for (MetodoPagamento m : metodos) {
            ProcessadorPagamento processador = new ProcessadorPagamento(m);
            try {
                processador.executarPagamento(200);
            } catch (PagamentoException e) {
                System.out.println("[ERRO]: "+ e.getMessage());
            }
            System.out.println();
        }
    }
}
