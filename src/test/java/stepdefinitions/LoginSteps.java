package stepdefinitions;

import cucumber.api.java.en.*;
import general.User;
import pages.login.LoginPageObject;

public class LoginSteps {

    private LoginPageObject login = new LoginPageObject();
    private HomepageSteps homepageSteps = new HomepageSteps();
    private SignupSteps signupSteps = new SignupSteps();
    private User user = new User();

    @Given("^I have created account$")
    public void iHaveCreatedAccount() {
        homepageSteps.iNavigateToSignUpPage();
        signupSteps.iCreateNewAccount();
        homepageSteps.iSelectMyAccountMenu();
        homepageSteps.iSelectLogoutButton();
    }

    @And("^I enter Email address in Login Page$")
    public void iEnterEmailAddress() {
        login.enterEmail(user.getEmailAddress());
    }

    @And("^I enter Password in Login Page$")
    public void iEnterPassword() {
        login.enterPassword(user.getPassword());
    }

    @And("^I select Remember me in Login Page$")
    public void iSelectRememberMe() {
        login.selectRememberMeCheckbox();
    }

    @And("^I select Login button in Login Page$")
    public void iSelectLoginButton() {
        login.selectLoginButton();
    }
}
