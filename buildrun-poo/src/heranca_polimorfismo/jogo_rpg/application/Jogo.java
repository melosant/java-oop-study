package heranca_polimorfismo.jogo_rpg.application;

import heranca_polimorfismo.jogo_rpg.exception.ErrosInesperados;
import heranca_polimorfismo.jogo_rpg.exception.ValorInválidoException;
import heranca_polimorfismo.jogo_rpg.model.Heroi;
import heranca_polimorfismo.jogo_rpg.model.Monstro;
import heranca_polimorfismo.jogo_rpg.model.Personagem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        exibirHerois();
        Heroi heroi = escolhaHeroi();

        Monstro monstro = criarMonstro();
        monstro.mostrarApresentacao();
        int[] listaOpcoes = new int[]{1, 2, 3};

        while (true) {
            if (heroi.estaMorto()) {
                System.out.println("\nVocê morreu!");
                break;
            }

            if (monstro.estaMorto()) {
                System.out.println("\nO Monstro morreu!");
                break;
            }

            System.out.println("\nSeu turno: ");
            System.out.println("1. Atacar | 2. Usar Habilidade Especial | 3. Beber Poção de Vida");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    heroi.atacar(monstro);
                    break;
                case 2:
                    heroi.usarAtaqueEspecial(monstro);
                    break;
                case 3:
                    heroi.usarPocaoVida();
                    break;
            }

            System.out.println("Turno do Monstro: ");
            int indice = (int) (Math.random() * listaOpcoes.length);
            int escolhaMonstro = listaOpcoes[indice];
            switch (escolhaMonstro) {
                case 1:
                    monstro.atacar(heroi);
                    break;
                case 2:
                    monstro.usarAtaqueEspecial(heroi);
                    break;
                case 3:
                    monstro.regenerarVida();
                    break;
            }

            System.out.println();
            heroi.mostrarApresentacao();
            monstro.mostrarApresentacao();
        }
    }

    public static void exibirHerois() {
        System.out.println("Heróis disponíveis: ");
        System.out.println("1. Guerreiro (Vida: 100, Ataque: 20, Defesa: 5, Especial: 1, Poção de Vida: 1)");
        System.out.println("2. Mago (Vida: 80, Ataque: 25, Defesa: 10, Especial: 1, Poção de Vida: 2)");
        System.out.println("3. Arqueiro (Vida: 90, Ataque: 18, Defesa: 8, Especial: 3, Poção de Vida: 1)");
    }

    public static Heroi escolhaHeroi() {
        while (true) {
            try {
                System.out.println("Escolha seu herói: ");
                int escolhaHeroi = sc.nextInt();

                if (escolhaHeroi < 1 || escolhaHeroi > 3) {
                    throw new ValorInválidoException("Digite um valor válido [1-3]");
                } else {
                    switch (escolhaHeroi) {
                        case 1:
                            return criarGuerreiro();
                        case 2:
                            return criarMago();
                        case 3:
                            return criarArqueiro();
                    }
                }
            } catch (InputMismatchException e) {
                throw new ErrosInesperados("Digite um valor válido [1-3]");
            } catch (Exception e) {
                throw new ErrosInesperados("Ocorreu um erro inesperado no sistema: " + e.getMessage());
            }
        }
    }

    public static Heroi criarGuerreiro() {
        return new Heroi("Itadori", 100, 20, 5, "Guerreiro", 1, 1, "Kokusen");
    }

    public static Heroi criarMago() {
        return new Heroi("Gojo", 80, 25, 10, "Mago", 1, 2, "Muryokusho");
    }

    public static Heroi criarArqueiro() {
        return new Heroi("Choso", 90, 18, 8, "Arqueiro", 1, 3, "Compressao De Sangue");
    }

    public static Monstro criarMonstro() {
        return new Monstro("Sukuna", 100, 15, 5, 20, "Desmantelar", 2.5);
    }
}
