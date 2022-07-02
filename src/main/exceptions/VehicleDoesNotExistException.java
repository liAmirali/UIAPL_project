package main.exceptions;

public class VehicleDoesNotExistException extends InvalidTravelException {
    public VehicleDoesNotExistException(String message) {
        super(message);
    }
}
