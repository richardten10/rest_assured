package Basic;

import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.ArrayList;

public class Practice {

    @Test
    public void GetWeatherDetails()
    {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

        // Get the RequestSpecification of the request that you want to sent
        // to the server. The server is specified by the BaseURI that we have
        // specified in the above step.
        RequestSpecification httpRequest = RestAssured.given();

        // Make a request to the server by specifying the method Type and the method URL.
        // This will return the Response from the server. Store the response in a variable.
        Response response = httpRequest.request(Method.GET, "/Hyderabad");

        // Now let us print the body of the message to see what response
        // we have recieved from the server
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);

        // First get the JsonPath object instance from the Response interface
        JsonPath jsonPathEvaluator = response.jsonPath();

        // Then simply query the JsonPath object to get a String value of the node
        // specified by JsonPath: City (Note: You should not put $. in the Java code)
        String city = jsonPathEvaluator.get("City");

        System.out.println("Asking for city result => " + city);

        String test = response.path("City");
        System.out.println("response.path result = " + test);

    }

    @Test
    public void test() {
        RestAssured.baseURI = "https://api.coinmarketcap.com/v2/ticker/";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET);

       // JsonPath jsonPathEvaluator = response.jsonPath();

        String test6 = response.getContentType();

        System.out.println(test6);
    }

}

