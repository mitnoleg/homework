package lesson8.adv2;

public class WatchBrokenError extends Exception {

    public WatchBrokenError(String message) {
        super(message);
    }

    public WatchBrokenError(String message, Throwable cause) {
        super(message, cause);
    }

    public WatchBrokenError(Throwable cause) {
        super(cause);
    }

    public WatchBrokenError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
