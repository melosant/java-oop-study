package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
covariância : get/put
- permite acessar mas não permite inserção
- no exemplo a lista que vai ser copiada pode ser do tipo Number ou seus subtipos (Integer e Double nesse caso)
contravariância
- permite a inserção mas não permite o acesso
- no exemplo a lista que vai receber os elementos pode ser do tipo Number ou de superclasses de Number (Object)

assim, podemos adicionar elementos de tipos específicos em uma lista genérica.
 */
public class Program {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        copy(myDoubles, myObjs);

        printList(myObjs);
    }

    private static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    private static void printList(List<?> list) {
        for (Object o : list) {
            System.out.print(o + " | ");
        }
    }

}
