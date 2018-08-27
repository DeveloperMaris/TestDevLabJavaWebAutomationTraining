package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;

public class HomepageSteps {

    private TestContext test;

    public HomepageSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Given("^Landing page is opened$")
    public void iHaveOpenedHomePage() {
        test.getNavigation().waitUntilPageLoadingIsFinished();

        assertThat(test.getNavigation().isLogoVisible()).isTrue();
//        assertThat(test.getNavigation().isMyAccountButtonVisible()).isTrue();
    }

    @When("^I select My Account button in Navigation bar$")
    public void iSelectMyAccountMenu() {
        test.getNavigation().selectMyAccountButton();
    }

    @And("^I select Sign Up button in Navigation bar")
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
        test.getHotel().setHotelName(hotel);
        test.getBookHotelsPage().enterHotelName(test.getHotel().getHotelName());
    }

    @And("^I select hotel that is located in ([^\\”]*)")
    public void iSelectHotelWithLocated(String location) {
        test.getHotel().setLocation(location);
        test.getBookHotelsPage().selectHotelFromList(test.getHotel().getLocation());
    }

    @And("^I select (\\w+).(\\w+).(\\w+) as Check in date$")
    public void iSelectAsCheckInDate(String day, String month, String year) {
        test.getHotel().setCheckInDate(day + "/" + month + "/" + year);
        test.getBookHotelsPage().enterCheckInDate(test.getHotel().getCheckInDate());
    }

    @And("^I select (\\w+).(\\w+).(\\w+) as Check out date$")
    public void iSelectAsCheckOutDate(String day, String month, String year) {
        test.getHotel().setCheckOutDate(day + "/" + month + "/" + year);
        test.getBookHotelsPage().enterCheckOutDate(test.getHotel().getCheckOutDate());
    }

    @And("^I select (\\w+) Adult and (\\w+) Child$")
    public void iSelectAdultAndChildren(String adultCount, String childrenCount) {
        test.getHotel().setAdultsCount(adultCount);
        test.getHotel().setChildCount(childrenCount);

        test.getBookHotelsPage().selectTravelersField();

        test.getBookHotelsPage().selectTravelerAdultField();
        test.getBookHotelsPage().enterTravelerAdultCount(test.getHotel().getAdultsCount());

        test.getBookHotelsPage().selectTravelerChildField();
        test.getBookHotelsPage().enterTravelerChildCount(test.getHotel().getChildCount());
    }

    @And("^I select Search button$")
    public void iSelectSearchButton() {
        test.getBookHotelsPage().selectHotelSubmitButton();
    }

    @And("^correct amount of hotels is found$")
    public void correctAmountOfHotelsIsFound() {
        test.getBookHotelsPage().waitUntilHotelsSearchResultsAreDisplayed();
        assertThat(test.getBookHotelsPage().getHotelsFromSearchResults()).hasSize(1);
    }
}
