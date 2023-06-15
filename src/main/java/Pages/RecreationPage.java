package Pages;

import com.codeborne.selenide.SelenideElement;

import java.util.List;
import java.util.function.Consumer;

import static com.codeborne.selenide.Selenide.*;

public class RecreationPage {
    public
        SelenideElement minPrice = $x("//*[@id='sidebar']//*[@id='minprice']");
       public SelenideElement maxPrice = $x("//*[@id='sidebar']//*[@id='maxprice']");
       public List < SelenideElement > prices =  $$x("//*[@id='sidebar-container']//*[@class='deal-voucher-price'][1]");
       public SelenideElement submitButton= $x("//*[@id='sidebar']//*[@class='submit-button']");


}
