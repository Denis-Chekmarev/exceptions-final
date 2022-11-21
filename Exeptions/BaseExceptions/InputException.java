package Exeptions.BaseExceptions;

public class InputException extends Exception {
    
    public InputException() {
        super("Wrong input");
    }

    public InputException(String message) {
        super(message);
    }
}
