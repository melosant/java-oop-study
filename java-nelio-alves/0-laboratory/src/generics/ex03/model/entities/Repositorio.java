package generics.ex03.model.entities;

import generics.ex03.model.exceptions.NaoEncontradoException;
import generics.ex03.model.exceptions.RepositorioException;
import generics.ex03.model.exceptions.RepositorioVazioException;

import java.util.ArrayList;
import java.util.List;

/*
Sem extends Identificavel, um T genérico livre é tratado pelo compilador como se fosse Object (esse é o comportamento
padrão de type erasure em Java — um generic sem limite superior assume Object como teto). E Object não tem o método getId().
 */
public class Repositorio<T extends Identificavel> {
    private List<T> list = new ArrayList<>();

    public void salvar(T item) {
        list.add(item);
    }

    public T buscarPorId(Integer id) throws RepositorioException {
        if (list.isEmpty()) throw new RepositorioVazioException("Lista vazia.");

        for (T t : list) {
            if (id.equals(t.getId())) {
                return t;
            }
        }
        throw new NaoEncontradoException("Item não encontrado no repositório.");
    }

    public List<T> listarTodos() {
        return new ArrayList<>(list);
    }
}
