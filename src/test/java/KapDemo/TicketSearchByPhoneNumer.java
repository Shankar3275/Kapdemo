package KapDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

import static KapDemo.Login.driver;
@Listeners(ForScreenShot.class)
public class TicketSearchByPhoneNumer {
    @Test(retryAnalyzer = MyRetry.class)
    public void TicketSearchByPhoneNumer() throws InterruptedException {

        Login TicketSearchByPhoneNumer = new Login();
        ChromeDriver driver = TicketSearchByPhoneNumer.login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(3000);
        //Click on serach box and enter the ticket id
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("8547872521");
        //click on enter from keyboard
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
    }
}
