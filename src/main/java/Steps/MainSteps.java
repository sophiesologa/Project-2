package Steps;

import Pages.MainPage;
import Pages.RecreationPage;
import io.qameta.allure.Step;

public class MainSteps {
    MainPage mainPage = new MainPage();

    @Step
    public MainSteps  clickRecreation(){
        mainPage.recreation.click();

        return this;
    }

    @Step
    public MainSteps clickCategories(){
      mainPage.categories.click();
        return this;
    }
    @Step
    public  MainSteps clickEnter(){
        mainPage.Enter.click();
        return  this;
    }

}
