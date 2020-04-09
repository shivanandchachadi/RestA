import org.testng.annotations.Test;

import java.io.IOException;

public class TestIT extends Restmethods {

    @Test(priority = 0)
    public void verifyGetMethods() throws IOException {
        Restmethods.getMethod();
        //Restmethods.postMethod();
       // Restmethods.delete();

    }
    @Test
    public void verifyGetMethods02() throws IOException {

       Restmethods.postMethod();
        //Restmethods.getMethod();

    }
}
