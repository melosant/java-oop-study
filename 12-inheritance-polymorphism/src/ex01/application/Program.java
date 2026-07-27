package ex01.application;

import ex01.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número de produtos: ");
        int n = sc.nextInt();
        List<Product> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados Produto #" + i);
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            sc.nextLine();
            char tag = sc.next().toLowerCase().charAt(0);
        }

        sc.close();
    }
}
