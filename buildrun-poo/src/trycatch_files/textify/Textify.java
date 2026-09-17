package trycatch_files.textify;

import java.util.Map;
import java.util.Scanner;

public class Textify {
    public static final String CAMINHO = "C:/workspace/repo-estudos/java-oop-study/buildrun-poo/src/trycatch_files/textify/exemplo.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao Textify!");
        String conteudo = LeitorArquivo.lerArquivo(CAMINHO);
        String conteudoNormalizado = NormalizadorConteudo.converterMinusculo(conteudo);
        Map<String, Integer> palavrasContadas = ContadorPalavras.contar(conteudoNormalizado);
        ImpressoraResultados.imprimirResultados(palavrasContadas);

        sc.close();
    }

}
