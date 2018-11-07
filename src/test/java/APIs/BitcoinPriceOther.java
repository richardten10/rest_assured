package APIs;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BitcoinPriceOther {

    public float getPriceEUR() {
        RestAssured.baseURI = "https://api.cryptonator.com/api/ticker/btc-eur";
        RequestSpecification httpRequest = RestAssured.given();
//        Response response = setUp().request(Method.GET, "eur");
        Response response = httpRequest.request(Method.GET);
        String price = response.path("ticker.price");

//        System.out.println(price);


        return Float.parseFloat(price);



    }

}
