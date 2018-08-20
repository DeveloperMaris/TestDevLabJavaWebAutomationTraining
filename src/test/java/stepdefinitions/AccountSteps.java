package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import general.TestContext;

public class AccountSteps {

    private TestContext test;

    public AccountSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Then("^user account page is opened$")
    public void userAccountPageIsOpened() {
        System.out.println("ACCOUNT PAGE IS OPENED");
    }

    @And("^I logout$")
    public void iLogout() {
        test.getNavigation().selectLogoutButton();
    }

    @And("^I select User Account button$")
    public void iSelectUserAccountButton() {
        test.getNavigation().selectUserAccountButton(test.getUser().getFirstName());
    }

    @When("^I select Home button in Navigation bar$")
    public void iSelectHomeButtonInNavigationBar() {
        test.getNavigation().selectHomeButton();
    }

}
