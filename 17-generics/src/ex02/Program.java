package ex02;

import java.util.Arrays;
import java.util.List;

/*
o tipo generic curinga é o <?> e não Object.
- Não é permitido fazer inserções a coleções de tipo curinga, pois o compilador não sabe qual é o tipo da lista que foi instanciada.
 */
public class Program {
    public static void main(String[] args) {
        List<Integer> myNums = Arrays.asList(10, 8, 5);
        printList(myNums);

        System.out.println();

        List<String> myStrs = Arrays.asList("X", "Y", "ZZZ");
        printList(myStrs);
    }

    public static void printList(List<?> list) {
//        list.add(3);
        for (Object o : list) {
            System.out.print(o + " | ");
        }
    }
}
