package KapDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AttachCustomer {

    @Test
    public void attachCustomer() throws Exception {
        Login attachcustomer = new Login();
        ChromeDriver driver = attachcustomer.login();


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

        //Click on Customer Options Button
        driver.findElement(By.xpath("//*[@id=\"open-customer-btn-ticket\"]/span[1]/i")).click();
        Thread.sleep(1000);

        //Click on Search User Button
        driver.findElement(By.xpath("//*[@id=\"ticket_customer_search_button\"]/span[1]/span")).click();
        Thread.sleep(1000);

        //Fill the Name
        driver.findElement(By.xpath("//*[@id=\"panel1-content\"]/div/form/div[1]/div[1]/div/input")).sendKeys("Test");
        Thread.sleep(1000);

        //Click on Search Button
        driver.findElement(By.xpath("//*[@id=\"autoSearchByPhone\"]/span[1]")).click();
        Thread.sleep(4000);

        //Click on the ticket after search
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div/div[1]/div[2]/div/main/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div/div/table/tbody/tr[1]/td[2]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div/div[1]/div[2]/div/main/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div[3]/span")).click();
        Thread.sleep(2000);







    }
}
