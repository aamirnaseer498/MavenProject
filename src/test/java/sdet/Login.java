package sdet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {

    @Test
    public void loginTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver= new ChromeDriver();
        chromeDriver.manage().window().maximize();

        chromeDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        Assert.assertEquals(chromeDriver.getTitle(),"OrangeHRM");

        chromeDriver.close();

    }

}
