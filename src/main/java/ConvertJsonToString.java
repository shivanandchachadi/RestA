import org.testng.annotations.Test;

import java.io.IOException;

public class ConvertJsonToString {

    @Test
    public void stringConvert() throws IOException {
        String path=".//main//resources//data.txt";
        String file=Utils.fileToStringconversion(path);
    }
}
