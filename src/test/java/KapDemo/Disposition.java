package KapDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
@Listeners(ForScreenShot.class)
public class Disposition {
    @Test(retryAnalyzer = MyRetry.class)
    public void Disposition() throws InterruptedException {
        Login disposition = new Login();
        ChromeDriver driver = disposition.login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);
            //Click on serach box and enter the ticket id
            driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).click();
            driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]"))
                    .sendKeys("\r\n" + "704364160708");
            //click on enter from keyboard
            driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
            //click on expend view
            driver.findElement(By.xpath("//header/div[1]/div[1]/div[3]/div[5]/div[2]/div[1]/*[1]")).click();
            //click on ticket
            driver.findElement(By.xpath(
                            "//body/div[@id='kapture-app-root']/div[@id='fuse-layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]"))
                    .click();
            //click on dispose button
            driver.findElement(By.xpath(
                            "//body/div[@id='kapture-app-root']/div[@id='fuse-layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[1]/div[1]/*[1]"))
                    .click();
            Thread.sleep(3000);
            //click on remark and enter valur
            driver.findElement(By.xpath("//textarea[@id='ticket-remarks']")).click();
            driver.findElement(By.xpath("//textarea[@id='ticket-remarks']")).sendKeys("test");
            Thread.sleep(3000);
            //click on done
            driver.findElement(By.xpath("//span[contains(text(),'Done')]")).click();
        }
}
