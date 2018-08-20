package stepdefinitions;

import cucumber.api.java.en.*;
import cucumber.api.java8.En;
import general.User;
import pages.signup.SignUpPageObject;

public class SignupSteps implements En {

    private SignUpPageObject signup = new SignUpPageObject();
    private User user = new User();

    @And("^I enter First name$")
    public void iEnterFirstName() {
        signup.enterFirstName(user.getFirstName());
    }

    @And("^I enter Last name$")
    public void iEnterLastName() {
        signup.enterLastName(user.getLastName());
    }

    @And("^I enter Mobile number$")
    public void iEnterMobileNumber() {
        signup.enterMobileNumber(user.getMobileNumber());
    }

    @And("^I enter Email address$")
    public void iEnterEmailAddress() {
        signup.enterEmail(user.getEmailAddress());
    }

    @And("^I enter Password$")
    public void iEnterPassword() {
        signup.enterPassword(user.getPassword());
    }

    @And("^I confirm Password$")
    public void iConfirmPassword() {
        signup.enterConfirmationPassword(user.getPassword());
    }

    @Given("I create new account")
    public void iCreateNewAccount() {
        iEnterFirstName();
        iEnterLastName();
        iEnterMobileNumber();
        iEnterEmailAddress();
        iEnterPassword();
        iConfirmPassword();
    }

}
