package af.gov.anar.dck.infrastructure.exception;
import af.gov.anar.core.infrastructure.exception.api.BaseException;


public class InternalServerProblemException extends BaseException {

    public InternalServerProblemException() {
    }

    public InternalServerProblemException(String message, Throwable cause) {
        super(message, cause);
    }

    public InternalServerProblemException(String message, String errorCode) {
        super(message, errorCode);
    }

    public InternalServerProblemException(String message) {
        super(message);
    }

    public InternalServerProblemException(Throwable cause) {
        super(cause);
    }

    public InternalServerProblemException(String message, String errorCode, Throwable cause) {
        super(message, errorCode, cause);
    }
}
