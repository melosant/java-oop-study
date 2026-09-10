package payroll.application;

import payroll.entities.*;
import payroll.enums.Departamento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class FolhaDePagamento {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Endereco e1 = new Endereco("Rua X", 123);
        Endereco e2 = new Endereco("Rua Y", 456);
        Endereco e3 = new Endereco("Rua Z", 789);
        List<Funcionario> list = new ArrayList<>();

        Funcionario f1 = new Gerente(
                "Alex",
                "100.100.100-10",
                sdf.parse("01/01/2025"),
                Departamento.RH,
                e1,
                7000.00,
                450.00);

        Funcionario f2 = new Vendedor(
                "Marcos",
                "200.200.200-20",
                sdf.parse("15/03/2019"),
                Departamento.VENDAS,
                e2,
                2500.00,
                50000.00
        );

        Funcionario f3 = new Estagiario(
                "Joao",
                "300.300.300-30",
                sdf.parse("30/03/2024"),
                Departamento.TI,
                e3,
                850.00,
                122
        );

        list.add(f1);
        list.add(f2);
        list.add(f3);

        double sum = 0.0;
        System.out.println("FOLHA DE PAGAMENTO:");
        for (Funcionario f : list) {
            System.out.println(f);
            sum += f.calcularSalario();
        }

        System.out.println("\nFOLHA TOTAL : $" + String.format("%.2f", sum));
    }
}
