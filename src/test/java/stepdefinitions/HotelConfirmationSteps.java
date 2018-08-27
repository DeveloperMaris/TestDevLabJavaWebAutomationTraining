package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;

public class HotelConfirmationSteps {

    private TestContext test;

    public HotelConfirmationSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I select CONFIRM THIS BOOKING button$")
    public void iSelectConfirmThisBookingButton() {
        test.getHotelReservationConfirmationPage().selectConfirmThisBookingButton();

    }

    @And("^Booking confirmation page is opened$")
    public void bookingConfirmationPageIsOpened() {
        test.getNavigation().waitUntilPageLoadingIsFinished();

        assertThat(test.getHotelReservationConfirmationPage().isConfirmButtoVisible()).isTrue();
    }

    @And("^Personal data is correct$")
    public void personalDataIsCorrect() {
        assertThat(test.getHotelReservationConfirmationPage().getFirstName()).isEqualTo(test.getUser().getFirstName());
        assertThat(test.getHotelReservationConfirmationPage().getLastName()).isEqualTo(test.getUser().getLastName());
        assertThat(test.getHotelReservationConfirmationPage().getEmail()).isEqualTo(test.getUser().getEmailAddress());
    }

    @And("^Hotel data is correct$")
    public void hotelDataIsCorrect() {
        assertThat(test.getHotelReservationConfirmationPage().getHotelName()).isEqualTo(test.getHotel().getHotelName());
        assertThat(test.getHotelReservationConfirmationPage().getHotelLocation()).isEqualTo(test.getHotel().getLocation());
        assertThat(test.getHotelReservationConfirmationPage().getHotelCheckInDate()).isEqualTo(test.getHotel().getCheckInDate());
        assertThat(test.getHotelReservationConfirmationPage().getHotelCheckOutDate()).isEqualTo(test.getHotel().getCheckOutDate());
        assertThat(test.getHotelReservationConfirmationPage().getHotelRoom()).isEqualTo(test.getHotel().getRoomName());
        assertThat(test.getHotelReservationConfirmationPage().getHotelAdultCount()).isEqualTo(test.getHotel().getAdultsCount());
    }
}
