package Steps;

import Pages.RegistrationPage;
import io.qameta.allure.Step;

public class RegistrationSteps {
    RegistrationPage registrationPage = new RegistrationPage();
    DBSelect dbSelect = new DBSelect();

    @Step
    public RegistrationSteps clickRegistration() {
        registrationPage.registration.click();

        return this.clickRegistration();
    }
    @Step("SQL ბაზის გამოყენებით ავსებს სარეგისტრაციო ფორმას")

    public void fillRegistrationForm(String firstName, String lastName, String phone, String email,
                                     String dateOfBirth, String password) {

        registrationPage.FirstName.setValue(firstName);
        registrationPage.LastName.setValue(lastName);
        registrationPage.Phone.setValue(phone);
        registrationPage.Email.setValue(email);
       registrationPage.DateOfBirth.setValue(dateOfBirth);
        registrationPage.Password.setValue(password);
        registrationPage.confirmPassword.setValue(password);
    }



}
