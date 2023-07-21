package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
    // Driver Declaration
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.miui.calculator.go");
        options.setAppActivity("com.miui.calculator.cal.CalculatorActivity");
        options.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(serverURL, options);
    }

    @Test
    public void subtractTest() {
        // Perform the calculation
        driver.findElement(AppiumBy.id("com.miui.calculator.go:id/btn_9_s")).click();
        driver.findElement(AppiumBy.accessibilityId("minus")).click();
        driver.findElement(AppiumBy.id("com.miui.calculator.go:id/btn_2_s")).click();
        driver.findElement(AppiumBy.accessibilityId("minus")).click();
        driver.findElement(AppiumBy.id("com.miui.calculator.go:id/btn_3_s")).click();

        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        // Find the result
        String result = driver.findElement(AppiumBy.id("com.miui.calculator.go:id/result")).getText();


        Assert.assertEquals(result, "=4");
        driver.findElement(AppiumBy.id("clear")).click();

    }

    @Test
    public void multiplyTest() {
        // Perform the calculation
        driver.findElement(AppiumBy.id("com.miui.calculator.go:id/btn_6_s")).click();
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
        driver.findElement(AppiumBy.id("com.miui.calculator.go:id/btn_8_s")).click();
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
        driver.findElement(AppiumBy.id("com.miui.calculator.go:id/btn_9_s")).click();
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        // Find the result
        String result = driver.findElement(AppiumBy.id("com.miui.calculator.go:id/result")).getText();


        Assert.assertEquals(result, "=432");
        driver.findElement(AppiumBy.id("clear")).click();
    }

    // Test method
    @Test
    public void divideTest() {
        // Perform the calculation
        driver.findElement(AppiumBy.id("com.miui.calculator.go:id/btn_8_s")).click();
        driver.findElement(AppiumBy.accessibilityId("divide")).click();
        driver.findElement(AppiumBy.id("com.miui.calculator.go:id/btn_4_s")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        // Find the result
        String result = driver.findElement(AppiumBy.id("com.miui.calculator.go:id/result")).getText();


        Assert.assertEquals(result, "=2");
        driver.findElement(AppiumBy.accessibilityId("clear")).click();
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}