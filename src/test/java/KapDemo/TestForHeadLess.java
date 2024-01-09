package KapDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestForHeadLess {
    @Test
    public void TestForHeadLess()throws InterruptedException{
        ChromeOptions options= new ChromeOptions();
        options.setHeadless(true);
        ChromeDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://kapdemo.kapturecrm.com/nui/login");
        //Enter Username
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div/div/div[1]/div[2]/div/div/form/div[1]/div/div/input")).sendKeys("kapdemo");
        //Enter password
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div/div/div[1]/div[2]/div/div/form/div[2]/div/div/input")).sendKeys("Kapdemo@23");
        //Click on login
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div/div/div[1]/div[2]/div/div/form/button/span[1]1")).click();
    }
}
