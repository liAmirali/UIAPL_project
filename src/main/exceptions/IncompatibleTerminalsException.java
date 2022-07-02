package main.exceptions;

public class IncompatibleTerminalsException extends InvalidTravelException {
    public IncompatibleTerminalsException(String message) {
        super("Two terminals are not of the same type. " + message);
    }
}
