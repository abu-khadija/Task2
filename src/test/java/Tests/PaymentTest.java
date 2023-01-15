package Tests;

import Pages.PaymentClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentTest extends TestBase{
    @Test
    public void Payments() throws InterruptedException {
        PaymentClass p;
        p = new PaymentClass(driver);
        p.Payment();

        //Assertion
        String Url = TestBase.driver.getCurrentUrl();
        Assert.assertEquals(Url,"https://ksrtc.in/oprs-web/booking/revamp/paxInfo.do");
    }
}
