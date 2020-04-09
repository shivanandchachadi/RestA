
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;


import java.io.IOException;
import java.net.ResponseCache;

import static org.hamcrest.Matchers.containsString;

public class Restmethods {

        private static Response response;
        private static RequestSpecification reqSpecific=RestAssured.given();

        private static String serviceURL=null;
        private static String serviceurl=null;
        private static String stringbody=null;
        private static String path=null;

        @BeforeMethod
        public static void propread() throws IOException {
            serviceurl= Utils.readproperty("serviceURL");
        }


        public static void getMethod() {
            System.out.println("the string of body is " + stringbody);
            response = reqSpecific.get(serviceurl);
            response.then().assertThat().statusCode(200);
            System.out.println("The Get Request is successfully executed."+response.getBody().asString()    );
        }
        public static void postMethod() throws IOException {

            path = ".\\resources\\sample.json";
            stringbody = Utils.fileToStringconversion(path);
            response=reqSpecific.given().contentType("application/json").body(stringbody).post(serviceurl);
            System.out.println("the response code is "+ response.statusCode());
            System.out.println(""+response.getBody().asString());
            System.out.println("The Post Request is successfully executed.");
            Assert.assertEquals(response.statusCode(),201);





        }
        public static void delete()
        {
            response=reqSpecific.delete(serviceurl+"+5+");
            System.out.println("The Delete Request is successfully executed.");
        }

        public static void put() throws IOException {

            stringbody = Utils.fileToStringconversion(path);

            response=reqSpecific.given().contentType("application/json").body(stringbody).put(serviceurl);
            System.out.println("The Put Request is successfully executed.");
        }


}
