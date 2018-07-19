package stepdefinitions;

import cucumber.api.java8.En;

public class LoginSteps implements En {
    public LoginSteps() {
        And("^I select Login button$", () -> {
            selectLoginButton();
        });
        And("^I select Remember me$", () -> {
            selectRememberMeCheckbox();
        });
    }
}
