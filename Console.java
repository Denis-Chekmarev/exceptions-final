import java.util.Scanner;

public class Console {
    

    
    public String getData(String message){

        Scanner scan = new Scanner(System.in);
        System.out.printf(message);
        String data = scan.nextLine();
        scan.close();
        return data;
    }


    public String getData(){

        Scanner scan = new Scanner(System.in);
        System.out.printf("Input the data: ");
        String data = scan.nextLine();
        scan.close();
        return data;
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}
