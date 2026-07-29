package trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
o bloco finally é executado independente de ter estourado uma exceção ou não.
muito usado para fechar conexões com bancos de dados, arquivos, etc.
 */
public class FinallyProgram {
    public static void main(String[] args) {
        Scanner sc = null;
        File file = new File("C:/tmp/in.txt");

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Bloco finally executado");
        }
    }
}
