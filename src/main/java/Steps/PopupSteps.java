package Steps;

import Pages.PopupPage;
import io.qameta.allure.Step;

public class PopupSteps {
    PopupPage popupPage = new PopupPage();

    @Step
    public  PopupSteps hoverOnFeeding(){
        popupPage.feeding.hover();
        return this;

    }
    @Step
    public  PopupSteps clickSushi(){
        popupPage.sushi.click();
        return this;
    }
}
