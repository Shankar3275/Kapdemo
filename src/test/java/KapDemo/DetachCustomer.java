package KapDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DetachCustomer {
    @Test
    public void detachCustomer() throws Exception {
        Login detachcustomer = new Login();
        ChromeDriver driver = detachcustomer.login();

        //Click on serach box and enter the ticket id
        Thread.sleep(3000);
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]"))
                .sendKeys("\r\n" + "\n" +
                        "8704950008533\n");
        //click on enter from keyboard
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys(Keys.ENTER);
        //click on expend view
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[3]/div[5]/div[2]/div[1]/*[1]")).click();
        Thread.sleep(3000);
        //click on ticket
        driver.findElement(By.xpath(
                        "//body/div[@id='kapture-app-root']/div[@id='fuse-layout']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]"))
                .click();
        Thread.sleep(2000);

        //Click on Detach Customer Button
        driver.findElement(By.xpath("//*[@id=\"detach-customer-btn-ticket\"]/span[1]")).click();
        Thread.sleep(1000);

        //Click on the Detach Button
        driver.findElement(By.xpath("//*[@id=\"detach-customer-dialog\"]/div[2]/button[2]/span[1]")).click();
        Thread.sleep(1000);






    }
}
