package KapDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static KapDemo.Login.driver;
//To take screenshort
@Listeners(ForScreenShot.class)
public class Logout {
    @Test
    public void logout() throws InterruptedException {
        //ChromeOptions options= new ChromeOptions();
        //options.setHeadless(true);
        //options.addArguments("--headless");
        Login logout = new Login();
        ChromeDriver driver =logout.login();
        //click on employee name
        driver.findElement(By.xpath("//*[@id=\"fuse-toolbar\"]/div/div[2]/button[2]/span[1]/div[2]/span")).click();
        // Identify the dropdown element using its locator (e.g., ID, name, XPath, etc.)
        //storing logout drop down and click on logout
        WebElement dropdownElement = driver.findElement(By.xpath("//span[contains(text(),'Logout')]"));
        Login.waitForElementToBeDisplayed(driver, 10, dropdownElement);
        Thread.sleep(2000);
        dropdownElement.click();
        System.out.println("headless");
    }
}
