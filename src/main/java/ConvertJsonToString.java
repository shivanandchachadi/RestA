import org.testng.annotations.Test;

import java.io.IOException;

public class ConvertJsonToString {

    @Test
    public static String stringConvert() throws IOException {
        String path=".//main//resources//sample.json";
        String file=Utils.fileToStringconversion(path);
        String oneline=file.replaceAll("[\r\n]+", " ");
        System.out.println("the string is"+ oneline);
        return oneline;
    }
}
