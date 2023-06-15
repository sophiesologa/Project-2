import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Configuration.assertionMode;


public class ConfigClass {
    public WebDriverRunner driver;
    @BeforeSuite

    public void ConfigTests(){
        Configuration.timeout=10000;
        Configuration.browser = "chrome";
        Configuration.browserSize="1920x1080";
        assertionMode= AssertionMode.SOFT;
        Configuration.screenshots= true;

    }

    @BeforeMethod
    public void setup() {
        WebDriverRunner.setWebDriver(new ChromeDriver());
        WebDriverManager.chromedriver().setup();

        JavascriptExecutor js = (JavascriptExecutor) driver;
    }
    @AfterMethod
    public void tearDawn(){
        WebDriverRunner.closeWebDriver();

    }
}