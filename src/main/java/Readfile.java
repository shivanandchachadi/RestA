import org.testng.annotations.Test;

import java.io.*;
import java.util.*;


public class Readfile {


    public static  Map<String,String> readtextfile() throws IOException {
        final int lhs = 0;
        final int rhs = 1;

        Map<String,String> map=new HashMap<String, String>();

        File file=new File ((System.getProperty("user.dir")+"//src//main//resources//data.txt"));

        BufferedReader bfr= new BufferedReader(new FileReader(file));

        String datas;
        while ((datas=bfr.readLine())!= null)
        {
            String[] pair = datas.trim().split(":",2);
            String key=pair[0];
            String value=pair[1];
            map.put(key,value);
        }


        bfr.close();



        return(map);
    }
}
