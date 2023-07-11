import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Activity2 {
    static WebDriver driver=BrowserSetUp.browserInitialize();

    public static void main(String[] args) {

        driver.get("https://www.training-support.net/selenium/login-form");
        System.out.println("Home page title: " + driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        System.out.println("Login message: " + driver.findElement(By.id("action-confirmation")).getText());

        driver.close();
    }



}
