package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

public class BookingTicket extends PageBase {
    public BookingTicket(WebDriver driver) {
        super(driver);
    }



//    private final By Leaving_from = By.id("fromPlaceName");
//
//
//    private final By Going_To = By.id("toPlaceName");

    //Choose arrival date
    private final By Arrive_Date = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]");


    //Click Search Button
    private final By Search = By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button");


    public void Booking_Ticket() throws InterruptedException {
        Actions A = new Actions(driver);
        A.sendKeys(Keys.PAGE_DOWN).build().perform();

        WebElement Choose = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a")));
        Choose.click();




////        //select  Leaving  From
////        driver.findElement(Leaving_from).sendKeys("CHIKKAMAGALURU");
////        Thread.sleep(1000);
////
////        driver.findElement(Leaving_from).sendKeys(Keys.ENTER);
////        Thread.sleep(1000);
////        //driver.findElement(Leaving_from).sendKeys(Keys.TAB);
//
//        //Select Going To
//        driver.findElement(Going_To).sendKeys("BENGALURU", Keys.ENTER);
//        driver.findElement(Going_To).sendKeys(Keys.ENTER);
//        driver.findElement(Going_To).sendKeys(Keys.TAB);


        //Choose arrive date
        driver.findElement(Arrive_Date).click();

        //Click Search
        Thread.sleep(2000);
        driver.findElement(Search).click();
    }
}

