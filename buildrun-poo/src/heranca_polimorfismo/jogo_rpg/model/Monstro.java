package heranca_polimorfismo.jogo_rpg.model;

public class Monstro extends Personagem {
    private int qtdRegeneracaoVida;
    private String nomePoderEspecial;
    private double multiplicadorDanoEspecial;

    public Monstro(String nome, int vida, int ataque, int defesa, int qtdRegeneracaoVida, String nomePoderEspecial, double multiplicadorDanoEspecial) {
        super(nome, vida, ataque, defesa);
        this.qtdRegeneracaoVida = qtdRegeneracaoVida;
        this.nomePoderEspecial = nomePoderEspecial;
        this.multiplicadorDanoEspecial = multiplicadorDanoEspecial;
    }

    @Override
    public void atacar(Personagem alvo) {
        boolean ataqueEspecial = calculoChance();

        if (ataqueEspecial) {
            usarAtaqueEspecial(alvo);
            System.out.println("- Ataque evoluiu para " + nomePoderEspecial);
            System.out.println(nome + ": Poder Especial: " + nomePoderEspecial + " bem sucedido!");
        } else {
            super.atacar(alvo);
        }
    }

    @Override
    public void mostrarApresentacao() {
        System.out.println("-=-=-=-=-= MONSTRO -=-=-=-=-=-");
        System.out.println("- Nome: " + nome);
        System.out.println("- HP: " + vida);
        System.out.println("- Poder Especial: " + nomePoderEspecial);
    }

    @Override
    public void usarAtaqueEspecial(Personagem alvo) {
        int danoTotal = (int) (ataque * multiplicadorDanoEspecial);
        alvo.receberDano(danoTotal);
    }

    public void regenerarVida() {
        vida += qtdRegeneracaoVida;
        System.out.println(nome + " regenerou sua vida! [+" + qtdRegeneracaoVida + " HP]");
    }
}
