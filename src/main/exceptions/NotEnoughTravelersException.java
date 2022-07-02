package main.exceptions;

public class NotEnoughTravelersException extends TravelCancellationException {
    public NotEnoughTravelersException(String message) {
        super(message);
    }
}
