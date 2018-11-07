package APIs;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BitcoinPriceUSD {

    public float getBitcoinPriceUSD() {
        RestAssured.baseURI = "https://api.coinmarketcap.com/v2/ticker/";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET);

        Float priceUSD = response.path("data.1.quotes.USD.price");
//        System.out.println(priceUSD.toString());
        return priceUSD;
    }
}
