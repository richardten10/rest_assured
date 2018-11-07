package APIs;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CurrencyConversions {
//    @Test
    public float getConversionRate(String chosenCurrency) {
        RestAssured.baseURI = "https://api.exchangeratesapi.io";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "/latest");

//        String chosenCurrency = "GBP";

        Float conversionRate = response.path("rates." + chosenCurrency);
//        System.out.println(conversionRate.toString());

        return conversionRate;

    }
}
