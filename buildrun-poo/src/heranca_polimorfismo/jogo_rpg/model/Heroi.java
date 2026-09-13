package heranca_polimorfismo.jogo_rpg.model;

public class Heroi extends Personagem {
    private String classe;
    private int qtdAtaqueEspecial;
    private int qtdPocaoVida;
    private String nomeAtaque;

    public Heroi(String nome, int vida, int ataque, int defesa, String classe, int qtdAtaqueEspecial, int qtdPocaoVida, String nomeAtaque) {
        super(nome, vida, ataque, defesa);
        this.classe = classe;
        this.qtdAtaqueEspecial = qtdAtaqueEspecial;
        this.qtdPocaoVida = qtdPocaoVida;
        this.nomeAtaque = nomeAtaque;
    }

    @Override
    public void mostrarApresentacao() {
        System.out.println("-=-=-=-=-= HERÓI -=-=-=-=-=-");
        System.out.println("- Nome: " + getNome());
        System.out.println("- HP: " + vida);
        System.out.println("- Classe: " + classe);
    }

    @Override
    public void usarAtaqueEspecial(Personagem alvo) {
        if (qtdAtaqueEspecial < 0) {
            System.out.println("Não possui mais ataques especiais!");
            return;
        };

        boolean podeAtacar = calculoChance();

        if (podeAtacar) {
            int danoEspecial = ataque * 2;
            alvo.receberDano(danoEspecial);
            System.out.println(nome + ": Ataque Especial: " + nomeAtaque + " bem sucedido!");
            qtdAtaqueEspecial--;
        } else {
            System.out.println(nome + ": Ataque Especial: " + nomeAtaque + " mal-sucedido! " + alvo.getNome() + " defendeu!");
        }
    }

    public void usarPocaoVida() {
        if (qtdPocaoVida < 0) {
            System.out.println("Não possui mais poções de vida!");
            return;
        };

        vida += 20;
        qtdPocaoVida--;
        System.out.println(nome + " utilizou uma poção! [+20 HP]");
    }
}
