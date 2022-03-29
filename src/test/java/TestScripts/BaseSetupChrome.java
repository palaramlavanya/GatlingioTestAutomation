package TestScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseSetupChrome {
    static WebDriver driver;

    @BeforeClass
    public void setUpClass() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\palar\\IdeaProjects\\Gatlingio\\src\\test\\java\\ChromeDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000L);
    }
}