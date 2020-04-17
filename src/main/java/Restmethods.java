
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.*;
import java.io.IOException;
import java.net.ResponseCache;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.containsString;

public class Restmethods {

        private static Response response;
        private static RequestSpecification reqSpecific=RestAssured.given();

        private static String serviceURL=null;
        private static String serviceurl=null;
        private static String stringbody=null;
        private static String path=null;
    private static String header=null;

        @BeforeMethod
        public static void propread() throws IOException {
            serviceurl= Utils.readproperty("serviceURL");
        }


        public static void getMethod(String data,Map<String,String> headermap) throws IOException {


           // response = reqSpecific.given().contentType("application/json").get(serviceurl);
            response = reqSpecific.given().headers(headermap).get(serviceurl);
            response.then().assertThat().statusCode(200);
            System.out.println("The Get Request is successfully executed."+response.getBody().asString()    );
        }
        public static void postMethod(String requestbody,Map<String,String> headermap) throws IOException {

                System.out.println("The data is "+ requestbody.toString());

            //   response=reqSpecific.given().contentType("application/json").body(requestbody).post(serviceurl);
            response=reqSpecific.given().headers(headermap).body(requestbody).post(serviceurl);
            System.out.println("the response code is "+ response.statusCode());
            System.out.println(""+response.getBody().asString());
            System.out.println("The Post Request is successfully executed.");
            Assert.assertEquals(response.statusCode(),201);

    }
        public static void delete(String pathparms)
        {
            System.out.println("the service url is "+ serviceurl+pathparms);
            response=reqSpecific.delete(serviceurl+pathparms);
            System.out.println("The Delete Request is successfully executed.");
        }

        public static void put(String stringbody,Map map,String pathparms) throws IOException {

            response=reqSpecific.given().headers(map).body(stringbody).put(serviceurl+pathparms);
            System.out.println("The Put Request is successfully executed.");
        }



        //--------------dataprovide


    public  static String datasuplier(String testcaseid) throws IOException {
      Map<String,String> map =new HashMap<String,String>();
      System.out.println("The test case id is"+testcaseid);
      String value=null;
        map=Readfile.readtextfile();
       value=map.get(testcaseid);

        return value;

    }
}
