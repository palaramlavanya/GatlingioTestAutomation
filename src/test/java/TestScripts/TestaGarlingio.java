package TestScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestaGarlingio extends BaseSetupChrome {
    String Url = "https://computer-database.gatling.io/computers/";

    @Test(priority = 0)
    public void launchBrowser() throws InterruptedException {
        driver.get(Url);
        String exectedTitle = "Computers database";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(exectedTitle, actualTitle);
    }
    @Test(priority = 1)
    public void clickonAddComputer() throws InterruptedException {
        driver.findElement(By.id("add")).click();
    }
    @Test(priority = 2)
    public void submitNewComputer() throws InterruptedException {
        driver.findElement(By.name("name")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("name")).sendKeys("Compaq Systems");
        driver.findElement(By.name("introduced")).sendKeys("2021-10-01");
        //use xpath to click save new computer
        driver.findElement(By.xpath("/html/body/section/form/div/input")).click();
    }
}


