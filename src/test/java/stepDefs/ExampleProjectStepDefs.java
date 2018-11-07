package stepDefs;
import APIs.*;
import operations.*;

import cucumber.api.java8.En;
import org.junit.Assert;

import static java.lang.Thread.sleep;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import cucumber.api.java8.En;


import java.util.concurrent.TimeUnit;

public class ExampleProjectStepDefs extends operations implements En {
    BitcoinPriceUSD bitcoinPrice = new BitcoinPriceUSD();
    CurrencyConversions currencyConversions = new CurrencyConversions();
    BitcoinPriceOther bitcoinPriceOther = new BitcoinPriceOther();

    public ExampleProjectStepDefs() {
        Given("^I make some requests$", () -> {

        });

//        When("^I click sign up$", () -> {
//
//        });
//
//        And("^I fill out the information$", () -> {
////
//
//        });
//
//        And("^I submit the form$", () -> {
//
//        });
//
//
//        //2
//
//        When("^I log in$", () -> {
//
//        });

        Then("^The price will be correct$", () -> {
            assertResult();
//            Assert.assertEquals(bitcoinPriceOther.getPriceEUR(), convertPriceUSDtoEUR());
        });
    }

}
