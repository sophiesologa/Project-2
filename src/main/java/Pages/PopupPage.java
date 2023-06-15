package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PopupPage {

     public SelenideElement  feeding = $x("//li[@cat_id='CatId-3']");
    public SelenideElement sushi =$x("//div[@class='mobileSubCategories subCategory-3 openedMenu']//a[text()='სუში']");
}
