package main.exceptions;

public class PersonIDDoesNotExistException extends InvalidInputException {
    public PersonIDDoesNotExistException(String message) {
        super(message);
    }
}
