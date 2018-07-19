package stepdefinitions;

import cucumber.api.java8.En;

public class SignupSteps implements En {
    public SignupSteps() {
        Given("^I have opened homepage$", () -> {
            System.out.println("OPEN HOMEPAGE");
        });
        When("^I select My account menu$", () -> {
            selectMyAccountMenu();
        });
        And("^I select Sign up button$", () -> {
            selectSignUpButton();
        });
        And("^I enter First name$", () -> {
            enterFirstName();
        });
        And("^I enter Last name$", () -> {
            enterLastName();
        });
        And("^I enter Mobile number$", () -> {
            enterMobileNumber();
        });
        And("^I enter Email address$", () -> {
            enterEmailAddress();
        });
        And("^I enter Password$", () -> {
            enterPassword();
        });
        And("^I confirm Password$", () -> {
            enterConfirmPassword();
        });
        Then("^user account page is opened$", () -> {
            System.out.println("ACCOUNT PAGE IS OPENED");
        });
    }
}
