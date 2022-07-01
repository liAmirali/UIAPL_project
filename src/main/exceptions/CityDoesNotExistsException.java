package main.exceptions;

public class CityDoesNotExistsException extends Exception {
    public CityDoesNotExistsException(String message) {
        super(message);
    }
}
