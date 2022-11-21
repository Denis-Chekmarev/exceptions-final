package Exeptions.InputExceptions;

import Exeptions.BaseExceptions.InputException;

public class WrongDate extends InputException {
    
    public WrongDate(String message) {
        super(message);
    }

    public WrongDate() {
        super();
    }

    @Override
    public String getMessage() {
        return "Неверная дата";
    }
}
