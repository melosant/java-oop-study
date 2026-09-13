package heranca_polimorfismo.jogo_rpg.model;

public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void atacar(Personagem alvo) {
        boolean podeAtacar = calculoChance();

        if (podeAtacar) {
            alvo.receberDano(ataque);
            System.out.println(nome + ": Ataque bem sucedido!");
        } else {
            System.out.println(nome + ": Ataque mal-sucedido! " + alvo.getNome() + " defendeu!");
        }
    }

    public void receberDano(int dano) {
        vida -= dano;
    }

    public boolean estaMorto() {
        return vida <= 0;
    }

    public String getNome() {
        return nome;
    }

    public void mostrarVida() {
        System.out.println("- " + getNome() + " | HP: " + vida);
    }

    public abstract void mostrarApresentacao();

    public abstract void usarAtaqueEspecial(Personagem alvo);

    protected boolean calculoChance() {
        return Math.random() > 0.5;
    }
}
