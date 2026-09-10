package abstracao_encapsulamento.galinheiro;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Galinheiro galinheiro1 = new Galinheiro("Ovos de Ouro", 10, 3, LocalDateTime.now());
        Galinheiro galinheiro2 = new Galinheiro("Ovos de Bronze", 3, 1, LocalDateTime.now());

        galinheiro1.mostrarInfos();
        galinheiro2.mostrarInfos();
    }
}
