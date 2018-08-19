package pages.login;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageObject {

    private SelenideElement getEmailField() {
        return $("test");
    }

    private SelenideElement getPasswordField() {
        return $("test");
    }

    private SelenideElement getRememberMeCheckBox() {
        return $("test");
    }

    private SelenideElement getLoginButton() {
        return $("test");
    }

    private SelenideElement getSignUpButton() {
        return $("test");
    }

    private SelenideElement getForgetPasswordButton() {
        return $("test");
    }

    private SelenideElement getForgetPasswordPopupEmailField() {
        return $("test");
    }

    private SelenideElement getForgetPasswordPopupResetButton() {
        return $("test");
    }

    private SelenideElement getForgetPasswordPopupCloseButton() {
        return $("test");
    }

    public void enterEmail(String email) {
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
    }

    public void selectRememberMeCheckbox() {
        getRememberMeCheckBox().click();
    }

    public AccountPageObject selectLoginButton() {
        getLoginButton().click();
        return page(AccountPageObject.class);
    }

    public AccountPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(AccountPageObject.class);
    }

    public void selectForgetPasswordButton() {
        getForgetPasswordButton().click();
    }

    public void enterForgetPassowrdEmail(String email) {
        getForgetPasswordPopupEmailField().sendKeys(email);
    }

    public void selectForgetPasswordPopupCloseButton() {
        getForgetPasswordPopupCloseButton().click();
    }

    public void selectForgetPasswordPopupResetButton() {
        getForgetPasswordPopupResetButton().click();
    }
}
