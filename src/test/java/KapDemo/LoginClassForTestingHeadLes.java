package KapDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
@Test
@Listeners(ForScreenShot.class)
public class LoginClassForTestingHeadLes {
    public void login() throws InterruptedException {

        // To disable the notifications
        ChromeOptions options = new ChromeOptions();
        //options.setHeadless(true);
        options.addArguments("--disable-notifications");

        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://kapdemo.kapturecrm.com/nui/login");
        //Enter Username
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div/div/div[1]/div[2]/div/div/form/div[1]/div/div/input")).sendKeys("kapdemo");
        //Enter password
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div/div/div[1]/div[2]/div/div/form/div[2]/div/div/input")).sendKeys("Kapdemo@23");
        //Click on login
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div/div/div[1]/div[2]/div/div/form/button/span[1]")).click();
    }
}
