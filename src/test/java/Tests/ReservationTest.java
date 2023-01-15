package Tests;

import Pages.ReservationClass;
import org.testng.annotations.Test;


public class ReservationTest extends TestBase{
    @Test
    public void ReservTest() throws InterruptedException {
        ReservationClass r;
        r = new ReservationClass(driver);


        r.Reservation();
        r.Passenger_details();
    }




}
