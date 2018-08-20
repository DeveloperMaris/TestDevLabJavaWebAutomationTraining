package stepdefinitions;

import cucumber.api.java.en.*;
import general.TestContext;

public class HotelConfirmationSteps {

    private TestContext test;

    public HotelConfirmationSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I select “Confirm this booking” button$")
    public void iSelectConfirmThisBookingButton() {
        test.getHotelReservationConfirmationPage().selectConfirmThisBookingButton();
    }
}
