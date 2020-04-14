
import org.json.simple.JSONObject;

import java.io.*;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


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

    public static Map<String, String> readheader(String testcaseid) throws IOException {
        Map<String,String> headerlist=new HashMap<>();
        File file=new File ((System.getProperty("user.dir")+"//src//main//resources//headers.txt"));
        BufferedReader bfr= new BufferedReader(new FileReader(file));
        String datas;
        while ((datas=bfr.readLine())!=null)
        {
            String[] pair=datas.trim().split(":",2);
            String key=pair[0];
            if (key.equals(testcaseid))
            {
                String value=pair[1];
                String[] s=value.trim().split(",",2);
                String left=s[0];
                String right=s[1];
                headerlist.put(left,right);
            }



        }

        System.out.println("the headers are "+ headerlist);


        return headerlist;
    }


}


