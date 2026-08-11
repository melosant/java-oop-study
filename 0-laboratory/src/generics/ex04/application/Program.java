package generics.ex04.application;

import generics.ex04.model.entities.ListaUtils;
import generics.ex04.model.exceptions.ListaVaziaException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> listaStr = Arrays.asList("Maria", "Alex", "Maria", "Paulo", "Pedro");
        List<Integer> listaInt = Arrays.asList(10, 12, 14, 16, 18, 20);

        try {
            System.out.println("Primeiro item str: " + ListaUtils.primeiro(listaStr));
            System.out.println("Primeiro item int: " + ListaUtils.primeiro(listaInt));
            System.out.println("Primeiro item lista vazia: " + ListaUtils.primeiro(new ArrayList<>()));
        } catch (ListaVaziaException e) {
            System.out.println("[ERRO]: " + e.getMessage());
        }

        System.out.println("Há duplicatas em lista str? " + ListaUtils.contemDuplicado(listaStr));
        System.out.println("Há duplicatas em lista int? " + ListaUtils.contemDuplicado(listaInt));
    }
}
