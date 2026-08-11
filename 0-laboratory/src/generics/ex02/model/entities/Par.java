package generics.ex02.model.entities;

public class Par<A, B> {
    private A primeiro;
    private B segundo;

    public Par(A primeiro, B segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return primeiro + ", " + segundo;
    }

    public Par<B,A> inverter() {
        return new Par<>(segundo, primeiro);
    }

    public A getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(A primeiro) {
        this.primeiro = primeiro;
    }

    public B getSegundo() {
        return segundo;
    }

    public void setSegundo(B segundo) {
        this.segundo = segundo;
    }
}
