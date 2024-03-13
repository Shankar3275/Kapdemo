package KapDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

import static KapDemo.Login.driver;
@Listeners(ForScreenShot.class)

public class TicketCreation {
    private WebDriver driver;
    @Test(retryAnalyzer = MyRetry.class)
    public void TicketCreation() throws InterruptedException {
        Login TicketCreation = new Login();
        ChromeDriver driver = TicketCreation.login();
        //to click on + icon
        WebElement element=driver.findElement(By.xpath("//span[contains(text(),'add')]"));
        Login.waitForElementToBeDisplayed(driver,10,element);
        element.click();
        //Click on add ticket option
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]")).click();
        Thread.sleep(3000);
        //click on serach customer
        driver.findElement(By.xpath(
                        "//*[@id=\"fuse-layout\"]/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div/main/div/div/div[3]/div[1]/button/span[1]"))
                .click();
        //entring value into name field
        driver.findElement(By.xpath("//*[@id=\"panel1-content\"]/div/form/div[1]/div[2]/div/input")).sendKeys("NEIL");
        Thread.sleep(5000);
        //clcik on serach button
        driver.findElement(By.xpath(
                        "//body/div[@id='kapture-app-root']/div[@id='fuse-layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[2]/span[1]"))
                .click();
        Thread.sleep(3000);
        //to scroll page till AddticketDetailes field
        WebElement scroll= driver.findElement(By.xpath("//p[contains(text(),'Add Ticket Details')]"));
        Actions act = new Actions(driver);
        act.moveToElement(scroll).perform();
        //select 1st customer
        driver.findElement(By.cssSelector("[class='MuiTableRow-root']")).click();
        //scrool page till select customer button
        WebElement scroll1= driver.findElement(By.xpath("//span[contains(text(),'Select Customer')]"));
        act.moveToElement(scroll1).perform();
        Thread.sleep(5000);
        //to click on select customer
        driver.findElement(By.xpath("//span[contains(text(),'Select Customer')]")).click();
        //click on titile field and enter value
        driver.findElement(By.xpath("//body/div[@id='kapture-app-root']/div[@id='fuse-layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[2]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='kapture-app-root']/div[@id='fuse-layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("test");
        //click on remark and enter value
        driver.findElement(By.xpath("//body/div[@id='kapture-app-root']/div[@id='fuse-layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[4]/div[1]/textarea[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='kapture-app-root']/div[@id='fuse-layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[4]/div[1]/textarea[1]")).sendKeys("test");
        //scrolling till due date field
        WebElement scroll2= driver.findElement(By.xpath("//label[contains(text(),'Due Date')]"));
        act.moveToElement(scroll2).perform();
        //selecting folder level RCS chat
        driver.findElement(By.xpath("//span[contains(text(),'RCS Chat')]")).click();
        //scrolling till submit button
        WebElement scroll3= driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
        act.moveToElement(scroll3).perform();
        //click on submit
        driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
        //To store ticket detailes
        String ticketid = driver.findElement(By.xpath("//p[text()='Ticket ID']/following-sibling::a")).getText();
        Thread.sleep(3000);
            System.out.println("--------------------------------------------------------------");
        System.out.println(ticketid);
            System.out.println("----------------------------------------------------------------");
    }

}
