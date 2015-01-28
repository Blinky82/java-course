package Sellable;

public class ExceptionMessage extends Exception {

    private static final long message = 404;

    public ExceptionMessage() {
        super();
    }

    public ExceptionMessage(String message) {
        super(message);

    }
}