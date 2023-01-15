package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ReservationClass extends PageBase {
    public ReservationClass(WebDriver driver) {super(driver);}


    //WebElement Select_Seat = driver.findElement(By.id("SrvcSelectBtnForward0"));
    private final By Select = By.id("SrvcSelectBtnForward0");

    private final By Seat = By.id("Forward48");

    private final By BoardingPoint = By.id("Forward-1467550949362");

    private final By DropPoint = By.id("Forward-1467467616730");


    //Passenger Details
    private final By MobileNumber = By.id("mobileNo");

    private final By Email = By.id("email");

    private final By PassengerName = By.id("passengerNameForward0");

    //Gender
    private final By Gender = By.id("genderCodeIdForward0");
    private final By gender = By.xpath("//select[@id='genderCodeIdForward0']/option[2]");
    //*[@id="genderCodeIdForward0"]/option[2]


    private final By PassengerAge = By.id("passengerAgeForward0");

    //concession
    private final By Concession = By.id("concessionIdsForward0");
    private final By ConcessionOption = By.xpath("//*[@id=\"concessionIdsForward0\"]/option[2]");

    private final By MakePayment = By.id("PgBtn");




    //Booking the Seat
    public void Reservation(){

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();",driver.findElement(Select));

        Actions B = new Actions(driver);
        B.sendKeys(Keys.PAGE_DOWN).build().perform();

        js.executeScript("arguments[0].click();",driver.findElement(Seat));

        Actions C = new Actions(driver);
        C.sendKeys(Keys.PAGE_DOWN).build().perform();

        js.executeScript("arguments[0].click();",driver.findElement(BoardingPoint));

        Actions D = new Actions(driver);
        D.sendKeys(Keys.PAGE_DOWN).build().perform();

        js.executeScript("arguments[0].click();",driver.findElement(DropPoint));

    }



    //-	Fill the “Customer” and “Passenger” details
    //  *could be better With @DataProvider*
    public void Passenger_details() throws InterruptedException {
        driver.findElement(MobileNumber).sendKeys("6789125987");
        driver.findElement(Email).sendKeys("kdnv@gkf.com");
        driver.findElement(PassengerName).sendKeys("Kan");
        driver.findElement(Gender).click();
        driver.findElement(gender).click();
        driver.findElement(PassengerAge).sendKeys("20");
        driver.findElement(Concession).click();
        driver.findElement(ConcessionOption).click();
        driver.findElement(MakePayment).click();
        Thread.sleep(3000);

    }
}
