package stepdefinitions;

import cucumber.api.java8.En;
import pages.header.NavigationPageObject;

public class HomepageSteps implements En {

    private NavigationPageObject homepage = new NavigationPageObject();

    public HomepageSteps() {
        Given("^I have opened homepage$", () -> {
            System.out.println("Navigation is visible");
        });

        When("^I select My account menu$", () -> {
            homepage.selectMyAccountButton();
        });

        When("^I select Sign up button$", () -> {
            homepage.selectSignUpButton();
        });
    }

}
