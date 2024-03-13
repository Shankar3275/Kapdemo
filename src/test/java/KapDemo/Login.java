package KapDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
@Listeners(ForScreenShot.class)
public class Login {
    static ChromeDriver driver;
    @BeforeClass
    public  ChromeDriver login() throws InterruptedException {

        // To disable the notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setHeadless(false);

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://kapdemo.kapturecrm.com/nui/login");
        //Enter Username
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div/div/div[1]/div[2]/div/div/form/div[1]/div/div/input")).sendKeys("kapdemo");
        //Enter password
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div/div/div[1]/div[2]/div/div/form/div[2]/div/div/input")).sendKeys("Kapdemo@23");
        //Click on login
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div/div/div[1]/div[2]/div/div/form/button/span[1]")).click();
        return driver;
    }
    public static void waitForElementToBeDisplayed(WebDriver driver, int timeInSeconds, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
