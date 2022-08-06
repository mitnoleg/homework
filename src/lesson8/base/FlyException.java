package lesson8.base;

public class FlyException extends Exception{
    public FlyException() {
    }

    public FlyException(String message) {
        super(message);
    }

    public FlyException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlyException(Throwable cause) {
        super(cause);
    }

    public FlyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
