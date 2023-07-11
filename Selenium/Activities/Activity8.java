import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {
    static WebDriver driver = BrowserSetUp.browserInitialize();

    public static void main(String[] args) {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.training-support.net/selenium/dynamic-controls");
        System.out.println("Home page title: " + driver.getTitle());

        WebElement checkbox = driver.findElement(By.id("toggleCheckbox"));
        checkbox.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println(checkbox.isDisplayed());
        checkbox.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println(checkbox.isDisplayed());

        driver.close();


    }


}
