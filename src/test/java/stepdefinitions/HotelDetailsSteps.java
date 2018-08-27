package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;

public class HotelDetailsSteps {

    private TestContext test;

    public HotelDetailsSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I select ([^\\”]*) room$")
    public void iSelectHotelRoom(String roomName) {
        test.getHotel().setRoomName(roomName);
        test.getHotelDetailsPage().selectHotelRoomBookNowButton(test.getHotel().getRoomName());
    }

    @And("^Hotel details page is opened$")
    public void hotelDetailsPageIsOpened() {
        test.getNavigation().waitUntilPageLoadingIsFinished();
        assertThat(test.getHotelDetailsPage().isModifyButtonVisible()).isTrue();
    }

    @And("^Hotel details are correct$")
    public void hotelDetailsAreCorrect() {
        assertThat(test.getHotelDetailsPage().getHotelName()).isEqualTo(test.getHotel().getHotelName().toUpperCase());
        assertThat(test.getHotelDetailsPage().getHotelLocation()).contains(test.getHotel().getLocation().toUpperCase());
        assertThat(test.getHotelDetailsPage().getCheckInDate()).isEqualTo(test.getHotel().getCheckInDate());
        assertThat(test.getHotelDetailsPage().getCheckOutDate()).isEqualTo(test.getHotel().getCheckOutDate());
        assertThat(test.getHotelDetailsPage().getAdultValue()).isEqualTo(test.getHotel().getAdultsCount());
        assertThat(test.getHotelDetailsPage().getChildValue()).isEqualTo(test.getHotel().getChildCount());
    }
}
