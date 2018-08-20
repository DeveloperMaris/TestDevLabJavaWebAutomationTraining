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

    @And("^I am in Signup form$")
    public void iAmInSignUpForm() {
        iHaveOpenedHomePage();
        iSelectMyAccountMenu();
        iSelectSignUpButton();
    }


    @And("^I select book Hotels button$")
    public void iSelectBookHotelsButton() {
        test.getBookHotelsPage().selectBookHotelsButton();
    }

    @And("^I enter ([^\\”]*) hotel$")
    public void iEnterHotelName(String hotel) {
        test.getBookHotelsPage().enterHotelName(hotel);
    }

    @And("^I select hotel located in ([^\\”]*)")
    public void iSelectHotelWithName(String hotelName) {
        test.getBookHotelsPage().selectHotelFromList(hotelName);
    }

    @And("^I select (\\w+).(\\w+).(\\w+) as Check in date$")
    public void iSelectAsCheckInDate(String day, String month, String year) {
        test.getBookHotelsPage().enterCheckInDate(day, month, year);
    }

    @And("^I select (\\w+).(\\w+).(\\w+) as Check out date$")
    public void iSelectAsCheckOutDate(String day, String month, String year) {
        test.getBookHotelsPage().enterCheckOutDate(day, month, year);
    }

    @And("^I select (\\w+) Adult and (\\w+) Children$")
    public void iSelectAdultAndChildren(String adultCount, String childrenCount) {
        test.getBookHotelsPage().selectTravelersField();

        test.getBookHotelsPage().selectTravelerAdultField();
        test.getBookHotelsPage().enterTravelerAdultCount(adultCount);

        test.getBookHotelsPage().selectTravelerChildField();
        test.getBookHotelsPage().enterTravelerChildCount(childrenCount);
    }

    @And("^I select Search button$")
    public void iSelectSearchButton() {
        test.getBookHotelsPage().selectHotelSubmitButton();
    }
}
