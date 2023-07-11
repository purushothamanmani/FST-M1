import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity20 {
    static WebDriver driver = BrowserSetUp.browserInitialize();

    public static void main(String[] args) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        System.out.println("Home page title: " + driver.getTitle());

        driver.findElement(By.id("prompt")).click();


        Alert promtAlert = driver.switchTo().alert();


        String alertText = promtAlert.getText();
        System.out.println("Text in alert: " + alertText);

        promtAlert.sendKeys("Awesome!");


        promtAlert.accept();

        driver.quit();


    }


}
