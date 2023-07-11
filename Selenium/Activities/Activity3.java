import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Activity3 {
    static WebDriver driver=BrowserSetUp.browserInitialize();

    public static void main(String[] args) {

        driver.get("https://www.training-support.net/selenium/login-form");
        System.out.println("Home page title: " + driver.getTitle());
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//*[contains(@class,'ui button')]")).click();
        String text=driver.findElement(By.xpath("//*[@id='action-confirmation']")).getText();
        System.out.println("Login message: " + text);

        driver.close();
    }



}
