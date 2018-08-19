package stepdefinitions;

import cucumber.api.java.en.*;
import cucumber.api.java8.En;
import pages.header.NavigationPageObject;

public class HomepageSteps implements En {

    private NavigationPageObject homepage = new NavigationPageObject();

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomePage() {
        System.out.println("Navigation is visible");
    }

    @When("^I select My account menu$")
    public void iSelectMyAccountMenu() {
        homepage.selectMyAccountButton();
    }

    @When("^I select Sign up button$")
    public void iSelectSignUpButton() {
        homepage.selectSignUpButton();
    }

    @When("^I select Login button$")
    public void iSelectLoginButton() {
        homepage.selectLoginButton();
    }

    @When("^I select Logout button$")
    public void iSelectLogoutButton() {
        homepage.selectLogoutButton();
    }

    @When("^I navigate to Sign up page$")
    public void iNavigateToSignUpPage() {
        iSelectMyAccountMenu();
        iSelectSignUpButton();
    }

    @When("^I navigate to Login page$")
    public void iNavigateToLoginPage() {
        iSelectMyAccountMenu();
        iSelectLoginButton();
    }

}
