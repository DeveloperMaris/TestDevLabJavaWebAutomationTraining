package stepdefinitions;

import cucumber.api.java.en.*;
import general.TestContext;

public class HotelDetailsSteps {

    private TestContext test;

    public HotelDetailsSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I select ([^\\”]*) room$")
    public void iSelectHotelRoom(String roomName) {
        test.getHotelDetailsPage().selectHotelRoomBookNowButton(roomName);
    }
}
