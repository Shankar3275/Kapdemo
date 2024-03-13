package KapDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyProfile {
    @Test
    public void myProfile() throws Exception {
        Login myProfile = new Login();
        ChromeDriver driver = myProfile.login();

        //Click on Meesho SX Tab on top right
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"fuse-toolbar\"]/div/div[2]/button[2]")).click();
        Thread.sleep(1000);

        //Click on User Settings Button
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/li[1]/div")).click();
        Thread.sleep(5000);

        //Click On Update Password TAB
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div/div[1]/div/div/div/div[1]/div/div[2]/div/ul/div[2]/div/span")).click();
        Thread.sleep(1500);

        //Click on Sync with Events and Calenders Tab
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div/div[1]/div/div/div/div[1]/div/div[2]/div/ul/div[3]/div")).click();
        Thread.sleep(1500);

        //Click on System Settings Tab
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div/div[1]/div/div/div/div[1]/div/div[2]/div/ul/div[4]")).click();
        Thread.sleep(1500);

    }
}