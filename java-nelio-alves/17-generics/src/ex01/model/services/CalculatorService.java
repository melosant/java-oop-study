package ex01.model.services;

import java.util.List;

/*
declara um generics no método extendendo a Comparable
assim permitindo parametrizar o tipo da lista que vai entrar no método
 */
public class CalculatorService {
    public static <T extends Comparable<T>> T max (List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }

        T max = list.getFirst();
        for (T t : list) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }
}
