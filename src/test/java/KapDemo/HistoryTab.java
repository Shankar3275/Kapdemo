package KapDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
@Listeners(ForScreenShot.class)
public class HistoryTab {
    @Test(retryAnalyzer = MyRetry.class)
    public void HistoryTab() throws InterruptedException {
        Login HistoryTab = new Login();
        ChromeDriver driver = HistoryTab.login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(3000);
        //Click on serach box and enter the ticket id
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]"))
                .sendKeys("\r\n" + "6703158687917");
        //click on enter from keyboard
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
        //click on expend view
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[3]/div[5]/div[2]/div[1]/*[1]")).click();
        //click on ticket
        driver.findElement(By.xpath(
                        "//body/div[@id='kapture-app-root']/div[@id='fuse-layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]"))
                .click();
        Thread.sleep(5000);
        //click on Historytab
        driver.findElement(By.xpath("//body/div[@id='kapture-app-root']/div[@id='fuse-layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/button[4]/span[1]")).click();
        //click on > symbol
        //driver.findElement(By.xpath("//body/div[@id='kapture-app-root']/div[@id='fuse-layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/*[1]")).click();
        Thread.sleep(4000);
    }
}
