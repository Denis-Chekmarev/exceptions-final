package Exeptions.InputExceptions;

import Exeptions.BaseExceptions.InputException;

public class WrongGender extends InputException {

    @Override
    public String getMessage() {
        return "Неверно задан пол (Укажите одной буквой m - male или f - female";
    }
}
