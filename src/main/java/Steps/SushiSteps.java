package Steps;

import Pages.SushiPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.testng.SoftAsserts;
import io.qameta.allure.Step;

import java.sql.SQLOutput;

public class SushiSteps {
    SoftAsserts softAsserts = new SoftAsserts();
    SushiPage sushiPage = new SushiPage();

    @Step("pi=")
    public SushiSteps getSushiOpt() {
        sushiPage.sushiOptions.forEach(el -> {
            el.hover();
        });
        return this;
    }

    @Step
    public SushiSteps ClickFavoritesList() {
        sushiPage.favoritesList.click();
        return this;

    }

    @Step
    public SushiSteps checkPopUp() {
        sushiPage.popUp.shouldBe(Condition.visible);

        return this;
    }
    @Step public  SushiSteps checkVoucherNum(){
        sushiPage.soldVouchers.click();

        sushiPage.chartWidth.getAttribute("style")
                .replace("width","")
                .replace("%","")
                .trim();
        if (sushiPage.soldVouchers.equals(sushiPage.chartWidth)){
            System.out.println("გაყიდული ვაუჩერების ოდენობა ემთხვევა ჩართის ზომას");
        }else {
            System.out.println("გაყიდული ვაუჩერების ოდენობა არ ემთხვეავა ჩართის ზომას ");
        }
        return  this;
    }

    @Step
    public SushiSteps selectOptions() {
        sushiPage.sort.selectOption("ფასით კლებადი");
        return this;
    }

    @Step
    public SushiSteps Prices1() {


        return this;
    }



    @Step
    public SushiSteps comparePrices() {
        return this;


    }

    @Step
    public SushiSteps getSushiOpt1() {
        for (int i = 0; i < sushiPage.sushiOptions.size() - 1; i++) {
            sushiPage.sushiOptions.forEach(element -> {
                element.click();
            });

        }
        return this;
    }
        @Step
        public SushiSteps clickShare () {
            sushiPage.share.click();
            return this;
        }

    }
