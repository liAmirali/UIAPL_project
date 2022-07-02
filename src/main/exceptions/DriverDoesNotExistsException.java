package main.exceptions;

public class DriverDoesNotExistsException extends TravelCancellationException {
    public DriverDoesNotExistsException(String message) {
        super(message);
    }
}
