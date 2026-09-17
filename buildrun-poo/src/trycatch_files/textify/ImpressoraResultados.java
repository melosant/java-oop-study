package trycatch_files.textify;

import java.util.Map;

public class ImpressoraResultados {
    public static void imprimirResultados(Map<String, Integer> totalPalavras) {
        System.out.println("\n=-=-=-=-=-=- RESULTADO =-=-=-=-=-=-=");
        totalPalavras.forEach((chave, valor) -> {
            System.out.println(chave + " = " + valor);
        });
    }
}
