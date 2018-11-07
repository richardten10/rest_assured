package Junit_Tests;
import APIs.*;
import operations.*;

import org.junit.Assert;
import org.junit.Test;


public class Example extends operations {
    BitcoinPriceOther bitcoinPriceOther = new BitcoinPriceOther();

    @Test
    public void assertResult(){
//        System.out.println(bitcoinPriceOther.getPriceEUR());
//        System.out.println(convertPriceUSDtoEUR());
        Assert.assertEquals(bitcoinPriceOther.getPriceEUR(), convertPriceUSDtoEUR()); // test currently fails, requires modification to pass when roughly equal

    }
}
