package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    public
    SelenideElement recreation = $(By.linkText("დასვენება"));
    public SelenideElement categories = $x("//p[text()='კატეგორიები']");
    public  SelenideElement Enter = $x("//*[text()='შესვლა']");

}
