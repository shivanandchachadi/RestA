import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestIT extends Restmethods {
private Map<String,String> map=new HashMap<>();
private String data;



    @Test(priority = 0)
    public void verifyGetMethods() throws IOException {
        data=Restmethods.datasuplier("Testcase01");
         map=Utils.readheader("Testcase01");
         Restmethods.getMethod(map,data);


    }

    @Test
    public void verifyGetMethods02() throws IOException {
       String data=Restmethods.datasuplier("Testcase02");
        map=Utils.readheader("Testcase02");
       Restmethods.postMethod(data);

    }
    @Test
    public void verifyGetMethods03() throws IOException {
        String data=Restmethods.datasuplier("Testcase03");
        map=Utils.readheader("Testcase02");
        Restmethods.put(data,map);

    }
    @Test
    public void verifyGetMethods04() throws IOException {
        //String data=Restmethods.datasuplier("Testcase04");
        //map=Utils.readheader("Testcase02");
        Restmethods.delete();

    }
}
