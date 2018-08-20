package pages.login;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPageObject {

    private SelenideElement getEmailField() {
        return $("input[name='username']");
    }

    private SelenideElement getPasswordField() {
        return $("input[name='password']");
    }

    private SelenideElement getRememberMeCheckBox() {
        return $("#remember-me");
    }

    private SelenideElement getLoginButton() {
        return $("#loginfrm .loginbtn");
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
}
