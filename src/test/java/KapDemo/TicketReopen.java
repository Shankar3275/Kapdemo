package KapDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners(ForScreenShot.class)

public class TicketReopen {
    @Test(retryAnalyzer = MyRetry.class)
    public void TicketReopen() throws InterruptedException {
        Login TicketReopen = new Login();
        ChromeDriver driver = TicketReopen.login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(3000);
        //Click on serach box and enter the ticket id
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]"))
                .sendKeys("\r\n" + "\n" +
                        "704364160708");
        //click on enter from keyboard
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
        //click on expend view
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[3]/div[5]/div[2]/div[1]/*[1]")).click();
        //click on ticket
        driver.findElement(By.xpath(
                        "//body/div[@id='kapture-app-root']/div[@id='fuse-layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]"))
                .click();
        //click on 3 dot
        driver.findElement(By.xpath("//*[@id=\"ticketdetailstab\"]/button/span[1]/span")).click();
        Thread.sleep(4000);
        //click on reopen option
        driver.findElement(By.xpath("//*[@id=\"sort-ticket-menu\"]/div[3]/ul/li[5]")).click();
       //click on reamrk box and  enter value
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div/div[1]/div[2]/div/main/div/div/div[1]/div/div[2]/div[2]/div/div/div/div/div/form/div/div/div/textarea")).click();
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div/div[1]/div[2]/div/main/div/div/div[1]/div/div[2]/div[2]/div/div/div/div/div/form/div/div/div/textarea")).sendKeys("testing for reopen");
        //to click on submit button
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div/div[1]/div[2]/div/main/div/div/div[1]/div/div[2]/div[2]/div/div/div/div/div/form/div/button/span[1]")).click();
    }
}
