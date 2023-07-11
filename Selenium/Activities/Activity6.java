import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {
    static WebDriver driver = BrowserSetUp.browserInitialize();

    public static void main(String[] args) {

        driver.get("https://www.training-support.net/selenium/input-events");
        Actions action = new Actions(driver);
        System.out.println("Home page title: " + driver.getTitle());
        action.sendKeys("S").build().perform();
        action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();

        driver.close();


    }


}
