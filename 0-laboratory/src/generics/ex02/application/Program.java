package generics.ex02.application;

import generics.ex02.model.entities.Par;

public class Program {
    public static void main(String[] args) {
        Par<String, Integer> pessoa = new Par<>("Alex", 45);
        System.out.println(pessoa);

        Par<Integer,String> pessoaInversa = pessoa.inverter();
        System.out.println(pessoaInversa);
    }
}
