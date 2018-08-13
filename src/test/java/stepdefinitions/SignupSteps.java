package stepdefinitions;

import cucumber.api.java8.En;
import general.User;
import pages.signup.SignUpPageObject;

import static utils.RandomGenerator.*;

public class SignupSteps implements En {

    private SignUpPageObject signup = new SignUpPageObject();
    private User user = new User();
    private User userTwo = new User("Janis", "Berzins");

    public SignupSteps() {

        And("^I enter First name$", () -> {
            signup.enterFirstName(user.getFirstName());
        });
        And("^I enter Last name$", () -> {
            signup.enterLastName(user.getLastName());
        });
        And("^I enter Mobile number$", () -> {
            signup.enterMobileNumber(user.getMobileNumber());
        });
        And("^I enter Email address$", () -> {
            signup.enterEmail(user.getEmailAddress());
        });
        And("^I enter Password$", () -> {
            signup.enterPassword(user.getPassword());
        });
        And("^I confirm Password$", () -> {
            signup.enterConfirmationPassword(user.getPassword());
        });

    }

}
