package Exeptions.InputExceptions;

import Exeptions.BaseExceptions.InputException;

public class WrongFIO extends InputException {


    @Override
    public String getMessage() {
        return "Неверное ФИО";
    }
}
