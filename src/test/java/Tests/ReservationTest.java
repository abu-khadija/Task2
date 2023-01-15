package Tests;

import Pages.ReservationClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ReservationTest extends TestBase{
    @Test
    public void ReservTest() throws InterruptedException {
        ReservationClass r;
        r = new ReservationClass(driver);


        r.Reservation();
        r.Passenger_details();


        //Assertionn
        String Url = TestBase.driver.getCurrentUrl();
        Assert.assertEquals(Url,"https://ksrtc.in/oprs-web/booking/revamp/paxInfo.do");

    }




}
