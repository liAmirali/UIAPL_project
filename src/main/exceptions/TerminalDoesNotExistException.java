package main.exceptions;

public class TerminalDoesNotExistException extends InvalidTravelException {
    public TerminalDoesNotExistException(String message) {
        super(message);
    }
}
