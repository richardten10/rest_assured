package operations;
import APIs.*;
import org.junit.Assert;
import org.junit.Test;

public class operations {
    BitcoinPriceUSD bitcoinPrice = new BitcoinPriceUSD();
    CurrencyConversions currencyConversions = new CurrencyConversions();
    BitcoinPriceOther bitcoinPriceOther = new BitcoinPriceOther();


    public float convertPriceUSDtoEUR()  {
        float firstPrice;
        float conversionRate;
        firstPrice = bitcoinPrice.getBitcoinPriceUSD();
        conversionRate = 1/currencyConversions.getConversionRate("USD");
        float newPrice = firstPrice *  conversionRate;
        return newPrice;
    }


    public void assertResult(){
//        Assert.assertEquals(bitcoinPriceOther.getPriceEUR(), convertPriceUSDtoEUR());
//        test = bitcoinPriceOther.getPriceEUR() == convertPriceUSDtoEUR();
//        System.out.println(test);
//        System.out.println(bitcoinPriceOther.getPriceEUR());
//        System.out.println(convertPriceUSDtoEUR());
    }

}
