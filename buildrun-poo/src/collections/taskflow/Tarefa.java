package collections.taskflow;

public class Tarefa {
    private String id;
    private String descricao;
    private boolean finalizada;

    public Tarefa(String id, String descricao, boolean finalizada) {
        this.id = id;
        this.descricao = descricao;
        this.finalizada = finalizada;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void finalizarTarefa() {
        if (finalizada) {
            System.out.println("Tarefa já finalizada!");
            return;
        }

        finalizada = true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: " + id);
        sb.append(" | : " + descricao);
        if(finalizada) {
            sb.append(" | Finalizada");
        } else {
            sb.append(" | Em Andamento");
        }

        return sb.toString();
    }
}
