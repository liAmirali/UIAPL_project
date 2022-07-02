package main.exceptions;

public class NotEnoughBudgetException extends Exception{
    public NotEnoughBudgetException(String message) {
        super("Not enough budget: " + message);
    }
}
