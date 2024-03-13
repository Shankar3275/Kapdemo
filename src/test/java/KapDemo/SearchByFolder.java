package KapDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchByFolder {

    @Test
    public void searchByFolder() throws Exception {
        Login searchByFolder = new Login();
        ChromeDriver driver = searchByFolder.login();

        Thread.sleep(2000);

        //Click on Search By Folder Button
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/nav/div[1]/div/div/div[1]/button")).click();
        Thread.sleep(4000);

        //Click on the Inbox Button
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div[3]/div[2]/span[1]")).click();
        Thread.sleep(3000);

        //Click on the Done Button
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/div/button/span[1]")).click();
        Thread.sleep(2000);

        //Click on the All Junk Tab
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/nav/a[4]/div/span")).click();
        Thread.sleep(2000);

        //Click on search tab and Enter the email
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div/main/div/header/div/div/div[2]/form/div/input")).sendKeys("shankar.lamani@kapturecrm.com");
        Thread.sleep(4000);

    }
}