import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    static WebDriver driver = BrowserSetUp.browserInitialize();

    public static void main(String[] args) {

        driver.get("https://www.training-support.net/selenium/input-events");
        Actions action = new Actions(driver);
        System.out.println("Home page title: " + driver.getTitle());
        action.click().pause(3000).build().perform();
        String frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);
        action.doubleClick().pause(1000).build().perform();
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);
        action.contextClick().pause(1000).build().perform();
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        driver.close();

    }


}
