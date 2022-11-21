package Exeptions.InputExceptions;

import Exeptions.BaseExceptions.InputException;

public class WrongAmount extends InputException {
    
    public WrongAmount(String message) {
        super(message);
    }

    public WrongAmount() {
        super("Неверное кол-во данных");
    }

    @Override
    public String getMessage() {
        return "Неверное кол-во данных, необходимо ввести данные в формате <Фамилия Имя Отчество датарождения номертелефона пол>";
    }
}
