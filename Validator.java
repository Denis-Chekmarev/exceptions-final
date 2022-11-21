import Exeptions.InputExceptions.WrongAmount;
import Exeptions.InputExceptions.WrongDate;
import Exeptions.InputExceptions.WrongFIO;
import Exeptions.InputExceptions.WrongGender;
import Exeptions.InputExceptions.WrongNumber;

public class Validator {
    

    private final int AMOUNT = 6;


    public void checkAmount(int count) throws WrongAmount{
        if (count != AMOUNT){
            throw new WrongAmount();
        }
    }
 

    public void checkFIO(String fio) throws WrongFIO{
        String[] items = fio.split("\\d");
        if (items.length > 1){
            throw new WrongFIO();
        }
    }

    public void checkDate(String date) throws WrongDate{
        String[] items = date.split("\\.");
        try{
            if(Integer.parseInt(items[0]) > 31 || Integer.parseInt(items[1]) < 1){
                throw new WrongDate("Неверное число");
            }
            if(Integer.parseInt(items[1]) > 12 || Integer.parseInt(items[1]) < 1){
                throw new WrongDate("Неверный месяц");
            }
            if(Integer.parseInt(items[2]) > 9999 || Integer.parseInt(items[2]) < 1){
                throw new WrongDate("Неверный год");
            }
        }
        catch(IndexOutOfBoundsException | NumberFormatException e){
            throw new WrongDate("Неверный формат даты");
        }
    }

    public void checkPhone(String phone) throws WrongNumber{
        String[] items = phone.split("[A-Za-zА-Яа-я]");
        if (items.length > 1){
            throw new WrongNumber();
        }
    }

    public void checkMale(String male) throws WrongGender{
        if (!(male.equals("m") || male.equals("f"))){
            throw new WrongGender();
        }
    }
}
