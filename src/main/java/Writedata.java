import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writedata {

public static void writeToFile(String data) throws IOException {

   File file=new File(System.getProperty("user.dir")+"//src//main//resources//data.txt");
    FileOutputStream fileout= new FileOutputStream(file);
    fileout.write(data.getBytes(),0,data.length());


}

}
