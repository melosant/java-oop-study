package generics.ex01.application;

import generics.ex01.model.entities.Caixa;
import generics.ex01.model.exceptions.CaixaVaziaException;

public class Program {
    public static void main(String[] args) {
        Caixa<String> caixaStr = new Caixa<>();
        Caixa<Integer> caixaInt = new Caixa<>();

        caixaInt.guardar(10);
        caixaStr.guardar("Item X");

        System.out.println("Caixa Integer Vazia? " + caixaInt.estaVazia());
        System.out.println("Caixa String Vazia? " + caixaStr.estaVazia());

        try {
            int item = caixaInt.pegar();
            System.out.println("Item da Caixa Integer: " + item);
        } catch (CaixaVaziaException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("Caixa Integer Vazia? " + caixaInt.estaVazia());
        System.out.println("Caixa String Vazia? " + caixaStr.estaVazia());
    }
}
