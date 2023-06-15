package Steps;

import Pages.RecreationPage;
import com.codeborne.selenide.testng.SoftAsserts;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;
import static java.lang.Thread.*;
import static java.lang.Thread.sleep;

public class RecreationSteps {
    SoftAssert softAssert = new SoftAssert();
    RecreationPage recreationPage =new RecreationPage();
    @Step
    public RecreationSteps SetMinPrice(){
        recreationPage.minPrice.setValue("200");

        return this;
    }
    @Step
    public RecreationSteps SetMaxPrice(){
        recreationPage.maxPrice.setValue("230");
        return this;
    }
    @Step
    public RecreationSteps clickSubmit() {
      recreationPage.submitButton.click();
        return this;
   }

    @Step
    public RecreationSteps checkPrices(){
      for (int i=0; i< recreationPage.prices.size()-1;i++) {
           String textString =recreationPage.prices.get(i).getText();
           String editedString = textString.replaceAll("[^\\d.]", "");
            Integer price = Integer.parseInt(editedString);
          softAssert.assertEquals(price < 200 || price > 230,true);

          softAssert.assertAll();
        }
        return this;

    }

}
