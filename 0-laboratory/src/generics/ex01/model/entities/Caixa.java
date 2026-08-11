package generics.ex01.model.entities;

import generics.ex01.model.exceptions.CaixaVaziaException;

import java.util.ArrayList;
import java.util.List;

/*
Caso usasse Object como parametro, eu seria obrigado à fazer um cast do item ao pegá-lo, pois por padrão retornaria como
um valor do tipo Object. ou seja, caso eu tenha entrado com um Integer, por padrão ele ainda retornaria como Object, sendo
obrigado o cast para colocar em uma variável Integer.
 */
public class Caixa<T> {
    private List<T> estoque = new ArrayList<>();

    public void guardar(T item) {
        estoque.add(item);
    }

    public T pegar() throws CaixaVaziaException {
        if (estaVazia()) throw new CaixaVaziaException("Não é possível pegar item: caixa vazia.");
        return estoque.removeFirst();
    }

    public boolean estaVazia() {
        return estoque.isEmpty();
    }
}
