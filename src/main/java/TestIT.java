import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestIT extends Restmethods {
private Map<String,String> map=new HashMap<>();
private String data;



    @Test(priority = 0)
    public void verifyGetMethods() throws IOException {

        map=Utils.dataFromExcelSheet("Testcase01");
        String reqBody=map.get("Requestbody");
        Map<String,String> headermap=Utils.readheader(map.get("Headers"));
        Restmethods.getMethod(reqBody,headermap);


    }

    @Test
    public void verifyGetMethods02() throws IOException {

        map=Utils.dataFromExcelSheet("Testcase02");
        System.out.println("The data from excel is "+map);
        String requestbody=map.get("Requestbody");
        Map<String,String> headermap=Utils.readheader(map.get("Headers"));
        String pathparm=map.get("Pathparams");
        String queryparm=map.get("Queryparams");
        Restmethods.postMethod(requestbody,headermap);

    }
    @Test
    public void verifyGetMethods03() throws IOException {

        map=Utils.dataFromExcelSheet("Testcase03");
        String reqbody=map.get("Requestbody");
        String pathparms=map.get("Pathparams");
        Map<String,String> headermap=Utils.readheader(map.get("Headers"));
        Restmethods.put(reqbody,headermap,pathparms);

    }
    @Test
    public void verifyGetMethods04() throws IOException {

        map=Utils.dataFromExcelSheet("Testcase04");
        String pathparms=map.get("Pathparams");
        Restmethods.delete(pathparms);

    }
}
