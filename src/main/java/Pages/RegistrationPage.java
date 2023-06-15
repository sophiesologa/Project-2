package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RegistrationPage {


    public SelenideElement registration = $("#ui-id-3");
   public  SelenideElement FirstName = $("#pFirstName");
    public SelenideElement LastName =$("#pLastName");
    public SelenideElement Email =$("pEmail");
    public  SelenideElement Phone =$("#pPhone");
    public  SelenideElement  DateOfBirth = $("#pDateBirth");
    public  SelenideElement Password =$("pPassword");
    public  SelenideElement confirmPassword = $("pConfirmPassword");

}