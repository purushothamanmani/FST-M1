package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.time.Duration;

public class Activity9 {
    static WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUpBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Reporter.log("Starting Test |");
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("Opened Browser |");
        Reporter.log("Page title is " + driver.getTitle() + " |");

    }
    @BeforeMethod
    public void beforeMethod() {
        Reporter.log("Test Case Setup started |");
        driver.switchTo().defaultContent();
    }

    @Test(priority = 0)
    public void simpleAlertTestCase() {
        Reporter.log("simpleAlertTestCase() started |");
        //Click the button to open a simple alert
        driver.findElement(By.id("simple")).click();
        Reporter.log("Simple Alert opened |");

        //Switch to alert window
        Alert simpleAlert = driver.switchTo().alert();
        Reporter.log("Switched foucs to alert |");

        //Get text in the alert box and print it
        String alertText = simpleAlert.getText();
        Reporter.log("Alert text is: " + alertText + " |");

        //Assertion
        Assert.assertEquals("This is a JavaScript Alert!", alertText);

        simpleAlert.accept();
        Reporter.log("Alert closed");

        Reporter.log("Test case ended |");
    }

    @Test(priority = 1)
    public void confirmAlertTestCase() {
        Reporter.log("confirmAlertTestCase() started |");
        driver.findElement(By.id("confirm")).click();
        Reporter.log("Confirm Alert opened |");

        Alert confirmAlert = driver.switchTo().alert();
        Reporter.log("Switched foucs to alert |");

        String alertText = confirmAlert.getText();
        Reporter.log("Alert text is: " + alertText + " |");

        Assert.assertEquals("This is a JavaScript Confirmation!", alertText);

        confirmAlert.accept();
        Reporter.log("Alert closed |");

        Reporter.log("Test case ended |");
    }

    @Test(priority = 2)
    public void promptAlertTestCase() {
        Reporter.log("promptAlertTestCase() started |");
        driver.findElement(By.id("prompt")).click();
        Reporter.log("Prompt Alert opened |");

        Alert alert = driver.switchTo().alert();
        Reporter.log("Switched focus to alert |");

        String alertText = alert.getText();
        Reporter.log("Alert text is: " + alertText + " |");

        alert.sendKeys("Awesome!");
        Reporter.log("Text entered in prompt alert |");
        Assert.assertEquals("This is a JavaScript Prompt!", alertText);

        alert.accept();
        Reporter.log("Alert closed |");

        Reporter.log("Test case ended |");
    }

    @AfterClass
    public void tearDown() {
        Reporter.log("Ending Test |");
        driver.close();
    }
}
