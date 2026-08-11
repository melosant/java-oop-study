package generics.ex03.model.exceptions;

public class NaoEncontradoException extends RepositorioException {
    public NaoEncontradoException(String message) {
        super(message);
    }
}
