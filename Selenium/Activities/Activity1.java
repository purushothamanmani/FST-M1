import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Activity1 {
    static WebDriver driver=BrowserSetUp.browserInitialize();

    public static void main(String[] args) {

                driver.get("https://www.training-support.net");
        System.out.println("Home page title: " + driver.getTitle());
        driver.findElement(By.id("about-link")).click();
        System.out.println("About page title: " + driver.getTitle());
        driver.close();


    }
}