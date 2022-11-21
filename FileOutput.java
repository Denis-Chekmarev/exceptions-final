import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutput {
    
    File file;
    FileWriter fileWriter;

    public FileOutput(String filename) throws IOException {
        file = new File(filename);
    }


    public void write(String data) throws IOException{
        if (file.exists()) fileWriter = new FileWriter(file, true);
        else  fileWriter = new FileWriter(file, false);
        fileWriter.write(data + "\n");
        fileWriter.close();
    }

}
