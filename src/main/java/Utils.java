
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;


public class Utils {

    public static String fileToStringconversion(String filepath) throws IOException {

        URI path= Paths.get("src//main//resources//sample.json").toUri();
        System.out.println("the path to file is"+path);
        String jsonbody= new String (Files.readAllBytes(Paths.get(path)));
        System.out.println("the string body is "+jsonbody);
        Writedata.writeToFile(jsonbody);
        return jsonbody;
    }

    public static String readproperty(String key) throws IOException {
        Properties properties=new Properties();
        File file= new File(System.getProperty("user.dir")+"//src//main//resources//Application.properties");
        FileReader filereader= new FileReader(file);
        properties.load(filereader);
        String value=properties.getProperty(key);


        return value;


    }


}


