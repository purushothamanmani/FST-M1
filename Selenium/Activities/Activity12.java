import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12 {
    static WebDriver driver = BrowserSetUp.browserInitialize();

    public static void main(String[] args) {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.training-support.net/selenium/dynamic-controls");

        System.out.println("Home page title: " + driver.getTitle());


        WebElement textbox = driver.findElement(By.id("input-text"));

        System.out.println("Input field is enabled: " + textbox.isEnabled());

        driver.findElement(By.id("toggleInput")).click();

        System.out.println("Input field is enabled: " + textbox.isEnabled());
        driver.close();


    }


}
