package TestScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

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
        Thread.sleep(3);
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("Compaq Systems");
        Thread.sleep(3);
        driver.findElement(By.name("introduced")).sendKeys("2021-10-01");
        Thread.sleep(3);
        driver.findElement(By.xpath("/html/body/section/form/div/input")).click();
    }
}


