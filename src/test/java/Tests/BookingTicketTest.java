package Tests;

import Pages.BookingTicket;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BookingTicketTest extends TestBase{



    @Test
    public void BookingTest() throws InterruptedException {
        BookingTicket b;
        b = new BookingTicket(driver);
        b.Booking_Ticket();


        //assertion
        driver.findElement(By.id("arrival")).isDisplayed();


    }
}
