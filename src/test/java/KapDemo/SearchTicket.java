package KapDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTicket {

    public void searchticket () throws Exception {

        Login searchticket = new Login();
        ChromeDriver driver = searchticket.login();

        Thread.sleep(4000);

        //Unassigned tab
        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/nav/a[1]/div/span")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"fuse-layout\"]/div/div/div[2]/div/div[1]/div[2]/div/div/div[2]/div/div/main/div/header/div/div/div[2]/form/div/input")).sendKeys("KHUSHALIFASHION");
        Thread.sleep(1000);

        driver.findElement(By.xpath(""));



    }

}
