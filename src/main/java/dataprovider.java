import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class dataprovider  {

    @DataProvider(name = "data")
    public  Object[][] datasuplier() throws IOException {
        Map<Integer, String> map=new HashMap<>();
      //  map=Readfile.readtextfile();

       System.out.println(new Object[][]{{map}});
        return new Object[][] {{map}};

    }

}
