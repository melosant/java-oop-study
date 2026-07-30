package reservationSystem.model.exception;

public abstract class ReservaException extends Exception {
    public ReservaException(String message) {
        super(message);
    }
}
