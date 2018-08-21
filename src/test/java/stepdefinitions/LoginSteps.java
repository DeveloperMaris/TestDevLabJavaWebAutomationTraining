package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps {

    private TestContext test;

    public LoginSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I enter Email address in Login Page$")
    public void iEnterEmailAddress() {
        test.getLoginPage().enterEmail(test.getUser().getEmailAddress());
    }

    @And("^I enter Password in Login Page$")
    public void iEnterPassword() {
        test.getLoginPage().enterPassword(test.getUser().getPassword());
    }

    @And("^I select Remember me in Login Page$")
    public void iSelectRememberMe() {
        test.getLoginPage().selectRememberMeCheckbox();
    }

    @And("^I select Login button in Login Page$")
    public void iSelectLoginButton() {
        test.getLoginPage().selectLoginButton();
    }

    @And("^Login page is opened$")
    public void loginPageIsOpened() {
        test.getNavigation().waitUntilPageLoadingIsFinished();
        test.getLoginPage().waitUntilLoginFormIsLoaded();

        assertThat(test.getLoginPage().getFormTitleText()).isEqualTo("LOGIN");
        assertThat(test.getLoginPage().isLoginButtonVisible()).isTrue();
    }
}
