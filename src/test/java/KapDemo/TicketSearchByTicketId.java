package KapDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
@Listeners(ForScreenShot.class)
public class TicketSearchByTicketId {
    @Test(retryAnalyzer = MyRetry.class)
    public void TicketSearchByTicketId()throws InterruptedException {
        Login TicketSearchByTicketId = new Login();
        ChromeDriver driver = TicketSearchByTicketId.login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(3000);
        //Click on serach box and enter the ticket id
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]"))
                .sendKeys("\n" +
                        "704364160708");
        //click on enter from keyboard
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);

    }
}
