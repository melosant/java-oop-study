package reservationSystem.model.exception;

public class RecursoIndisponivelException extends ReservaException {
    public RecursoIndisponivelException() {
        super("ERRO: Recurso indisponível.");
    }
}
