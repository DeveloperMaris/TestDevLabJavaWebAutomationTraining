package stepdefinitions;

import cucumber.api.java.en.*;
import general.TestContext;

public class HomepageSteps {

    private TestContext test;

    public HomepageSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomePage() {
        System.out.println("Navigation is visible");
    }

    @When("^I select My account menu$")
    public void iSelectMyAccountMenu() {
        test.getNavigation().selectMyAccountButton();
    }

    @And("^I select Sign up button in Landing page")
    public void iSelectSignUpButton() {
        test.getNavigation().selectSignUpButton();
    }

    @And("^I select Login button in Landing page$")
    public void iSelectLoginButton() {
        test.getNavigation().selectLoginButton();
    }

    @And("^I am in Sign up form$")
    public void iAmInSignUpForm() {
        iHaveOpenedHomePage();
        iSelectMyAccountMenu();
        iSelectSignUpButton();
    }

}
