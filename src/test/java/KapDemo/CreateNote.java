package KapDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
@Listeners(ForScreenShot.class)
public class CreateNote {
    @Test(retryAnalyzer = MyRetry.class)
    public void CreateNote() throws InterruptedException {
        Login createNote = new Login();
        ChromeDriver driver = createNote.login();
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
            //click on notes tab
            driver.findElement(By.xpath("//body/div[@id='kapture-app-root']/div[@id='fuse-layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/button[2]/span[1]/span[1]/div[1]/*[1]")).click();
            Thread.sleep(4000);
            //click on note text box and enter value
            driver.findElement(By.xpath("//*[@id=\"ticketNotesEditor\"]/div[1]/div[2]/div[2]/div")).click();
            driver.findElement(By.xpath("//*[@id=\"ticketNotesEditor\"]/div[1]/div[2]/div[2]/div")).sendKeys("TESTING FROM AUTOMATION");
            driver.findElement(By.xpath("//body/div[@id='kapture-app-root']/div[@id='fuse-layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]/span[1]/span[1]")).click();
    }
}