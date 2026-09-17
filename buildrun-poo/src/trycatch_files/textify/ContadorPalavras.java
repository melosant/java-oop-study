package trycatch_files.textify;

import java.util.HashMap;
import java.util.Map;

public class ContadorPalavras {
    public static Map<String, Integer> contar(String conteudo) {
        String[] palavras = conteudo.split("\\s+");
        Map<String,Integer> totalPalavras = new HashMap<>();

        for (String palavra : palavras) {
            totalPalavras.merge(palavra, 1, Integer::sum);
        }

        return totalPalavras;
    }
}
