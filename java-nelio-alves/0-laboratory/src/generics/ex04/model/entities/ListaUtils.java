package generics.ex04.model.entities;

import generics.ex04.model.exceptions.ListaVaziaException;

import java.util.List;

public class ListaUtils {
    public static <T> T primeiro(List<T> lista) throws ListaVaziaException {
        if (lista.isEmpty()) throw new ListaVaziaException("A lista está vazia.");

        return lista.getFirst();
    }

    public static <T> boolean contemDuplicado(List<T> lista){
        for (int i = 0; i < lista.size(); i++) {
            for (int i1 = i + 1; i1 < lista.size(); i1++) {
                if (lista.get(i1).equals(lista.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
