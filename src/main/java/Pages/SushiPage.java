package Pages;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class SushiPage {
    public List<SelenideElement > sushiOptions= $$x( "//*[@id='sidebar-container']");
    public  SelenideElement favoritesList= $x("(//*[@class='deal-basket-wishlist'])[1]");
    public SelenideElement soldVouchers = $("//*[@id='sidebar-container']//*[text()='გაყიდულია 0'][1]");
    public  SelenideElement chartWidth= $("//*[@id='sidebar-container']//*[@class='voucher-limit']");
    public  SelenideElement popUp= $("#toogletabs");
    public  SelenideElement sort =  $x("//*[@id='sort']");
    public List<SelenideElement> prices = $$x("//*[@id='sidebar-container']//*[@class='deal-voucher-price'][1]");
    public  SelenideElement share =  $(".share");
}
