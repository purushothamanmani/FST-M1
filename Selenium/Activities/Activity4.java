import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Activity4 {
    static WebDriver driver=BrowserSetUp.browserInitialize();

    public static void main(String[] args) {

        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println("Home page title: " + driver.getTitle());

        String thirdHeaderText = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println(thirdHeaderText);
        String fifthHeaderColor = driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
        System.out.println(fifthHeaderColor);

        String violetButtonClass = driver.findElement(By.xpath("//*[text()='Violet']")).getAttribute("class");
        System.out.println(violetButtonClass);
        String greyButtonText = driver.findElement(By.xpath("//*[text()='Grey']")).getText();
        System.out.println(greyButtonText);

        driver.close();

    }



}
