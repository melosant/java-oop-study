package throwsexception.model.exceptions;

/*
pode herdar de Exception ou de RuntimeException
- Exception: compilador obriga o tratamento da exceção
- Runtime: compilador não obriga o tratamento da exceção
 */
public class DomainException extends Exception {
    public DomainException(String message) {
        super(message);
    }
}
