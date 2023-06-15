import Data.MySQLData;
import Steps.*;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.testng.ScreenShooter;
import com.codeborne.selenide.testng.SoftAsserts;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.sql.SQLException;



@Listeners({SoftAsserts.class, ScreenShooter.class})
@Epic("Swoop Tests")
@Feature("Recreation options")
public class SwoopTest extends ConfigClass{
        WebDriver driver;
        @BeforeMethod
        public void setup(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        @Description("Navigate to Swoop.ge")
        @Test(description = "", groups = "Regression1")
        @Story("Navigate to Swoop.ge and choose recreation ")
        @Severity(SeverityLevel.CRITICAL)
        public void Test1() throws InterruptedException {
            Selenide.open("https://www.swoop.ge/");
            MainSteps mainSteps = new MainSteps();
            RecreationSteps recreationSteps = new RecreationSteps();
            mainSteps.clickRecreation();
            recreationSteps.SetMinPrice()
                    .SetMaxPrice()
                    .clickSubmit()
                     .checkPrices();
        }
    @Description("Navigate to Swoop.ge")
    @Test(description = "Navigate to Swoop.ge",groups = "Regression1")
    @Story(" choose feeding")
    @Severity(SeverityLevel.CRITICAL)
    public void  Test2(){
        Selenide.open("https://www.swoop.ge/");
        MainSteps mainSteps = new MainSteps();
        SushiSteps sushiSteps = new SushiSteps();
        PopupSteps popupSteps = new PopupSteps();
        mainSteps.clickCategories();
        popupSteps.hoverOnFeeding()
                .clickSushi();
        sushiSteps.getSushiOpt()
         .ClickFavoritesList()
                .checkPopUp()
                .checkVoucherNum();


    }
    @Description("Navigate to Swoop.ge")
    @Test(description = "Navigate to Swoop.ge",groups = "Regression2")
    @Story(" choose feeding and sushi")
    @Severity(SeverityLevel.CRITICAL)
    public void Test3(){
        Selenide.open("https://www.swoop.ge/");
        MainSteps mainSteps = new MainSteps();
        SushiSteps sushiSteps = new SushiSteps();
        PopupSteps popupSteps = new PopupSteps();
        mainSteps.clickCategories();
        popupSteps.hoverOnFeeding()
                .clickSushi();
       sushiSteps.selectOptions();
    }
    @Description("Navigate to Swoop.ge")
    @Test(description = "Navigate to Swoop.ge", groups = "Regression2")
    @Story("sushi options ")
    @Severity(SeverityLevel.CRITICAL)
    public void Test4(){
        Selenide.open("https://www.swoop.ge/");
        MainSteps mainSteps = new MainSteps();
        SushiSteps sushiSteps = new SushiSteps();
        PopupSteps popupSteps = new PopupSteps();
        mainSteps.clickCategories();
        popupSteps.hoverOnFeeding()
                .clickSushi();
        sushiSteps.getSushiOpt1()
                .clickShare();


    }
    @Description("")
    @Test(description = "SQL server and swoop ", groups = "Regression2" )
    @Story("Navigate to Swoop.ge and  fill all fields")
    @Severity(SeverityLevel.CRITICAL)

    public void Test5() throws SQLException {
        Selenide.open("https://www.swoop.ge/");
            DBSteps dbSteps = new DBSteps();
            MainSteps mainSteps = new MainSteps();

            RegistrationSteps registrationSteps = new RegistrationSteps();
            dbSteps.addUser();
            mainSteps.clickEnter();
            registrationSteps.clickRegistration();
//                    .fillRegistrationForm();







    }


    @AfterMethod

    public void tearDawn(){
        WebDriverRunner.closeWebDriver();


    }

}