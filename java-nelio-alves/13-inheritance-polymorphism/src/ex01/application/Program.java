package ex01.application;

import ex01.entity.ImportedProduct;
import ex01.entity.Product;
import ex01.entity.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o número de produtos: ");
        int n = sc.nextInt();
        List<Product> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados Produto #" + i);
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            sc.nextLine();
            char tag = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Name:");
            String name = sc.nextLine();
            System.out.print("Price:");
            double price = sc.nextDouble();

            if (tag == 'c') {
                Product product = new Product(name, price);
                list.add(product);
            } else if (tag == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                Product product = new UsedProduct(name, price, date);
                list.add(product);
            } else {
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, fee);
                list.add(product);
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product p : list) {
            System.out.println(p);
        }

        sc.close();
    }
}
