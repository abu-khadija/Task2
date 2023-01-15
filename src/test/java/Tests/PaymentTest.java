package Tests;

import Pages.PaymentClass;
import org.testng.annotations.Test;

public class PaymentTest extends TestBase{
    @Test
    public void Payments() throws InterruptedException {
        PaymentClass p;
        p = new PaymentClass(driver);
        p.Payment();
    }
}
