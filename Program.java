import java.io.IOException;

import Exeptions.InputExceptions.WrongAmount;
import Exeptions.InputExceptions.WrongDate;
import Exeptions.InputExceptions.WrongFIO;
import Exeptions.InputExceptions.WrongGender;
import Exeptions.InputExceptions.WrongNumber;

/**
 * Program
 * 
    Напишите приложение, которое будет запрашивать у пользователя следующие данные, разделенные пробелом:
    Фамилия Имя Отчество датарождения номертелефона пол


    Форматы данных:
    фамилия, имя, отчество - строки
    дата_рождения - строка формата dd.mm.yyyy
    номер_телефона - целое беззнаковое число без форматирования
    пол - символ латиницей f или m
 */
public class Program {




    
    public static void main(String[] args) {


        Console console = new Console();
        String data = console.getData();

        String[] items = data.split(" ");
        Validator valid = new Validator();

        try{
            valid.checkAmount(items.length);
            valid.checkFIO(items[0]);
            valid.checkFIO(items[1]);
            valid.checkFIO(items[2]);
            valid.checkDate(items[3]);
            valid.checkPhone(items[4]);
            valid.checkMale(items[5]);
        }
        catch (WrongAmount e){
            console.showMessage(e.getMessage());
        }
        catch (WrongFIO e){
            console.showMessage(e.getMessage());
        }
        catch (WrongDate e){
            console.showMessage(e.getMessage());
        }
        catch (WrongNumber e){
            console.showMessage(e.getMessage());
        }
        catch (WrongGender e){
            console.showMessage(e.getMessage());
        }

        try{
            FileOutput output = new FileOutput(items[0]);
            output.write(data);
        }
        catch (IOException e){
            console.showMessage("Не удалось записать данные в файл, посмотрите на описание ошибки:\n");
            System.out.println(e.getStackTrace());
        }
    }
}