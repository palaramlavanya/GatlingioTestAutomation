package TestScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseSetupChrome {
    static WebDriver driver;

    @BeforeClass
    public void setUpClass() throws InterruptedException {
        String path = "C:\\Users\\palar\\IdeaProjects\\Gatlingio\\src\\test\\java\\ChromeDrivers\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}