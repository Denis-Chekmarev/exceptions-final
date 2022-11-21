package Exeptions.InputExceptions;

import Exeptions.BaseExceptions.InputException;

public class WrongNumber extends InputException {
    

    @Override
    public String getMessage() {
        return "Неверный номер телефона";
    }
}
