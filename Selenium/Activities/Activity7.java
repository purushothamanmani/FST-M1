import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    static WebDriver driver = BrowserSetUp.browserInitialize();

    public static void main(String[] args) {

        driver.get("https://www.training-support.net/selenium/drag-drop");
        Actions action = new Actions(driver);
        System.out.println("Home page title: " + driver.getTitle());
        System.out.println("Home page title: " + driver.getTitle());

        WebElement football = driver.findElement(By.id("draggable"));
        WebElement dropzone1 = driver.findElement(By.id("droppable"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        action.clickAndHold(football).moveToElement(dropzone1).pause(2000).release().build().perform();

        action.dragAndDrop(football, dropzone2).build().perform();

        driver.close();


    }


}
