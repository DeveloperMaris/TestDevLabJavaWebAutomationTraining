package stepdefinitions;

import cucumber.api.java8.En;

public class AccountSteps implements En {
    public AccountSteps() {
        Then("^user account page is opened$", () -> {
            System.out.println("ACCOUNT PAGE IS OPENED");
        });
    }
}
