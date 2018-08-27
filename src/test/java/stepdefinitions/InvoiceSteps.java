package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;

public class InvoiceSteps {

    private TestContext test;

    public InvoiceSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Then("^Unpaid invoice page is opened$")
    public void unpaidInvoicePageIsOpened() {
        test.getInvoicePage().waitUntilInvoiceTitleIsDisplayed();

        assertThat(test.getInvoicePage().getUnpaidElement().text()).isEqualTo("UNPAID");
    }

    @And("^Hotel details are correct in Invoice page$")
    public void hotelDetailsAreCorrectInInvoicePage() {
        assertThat(test.getInvoicePage().getHotelName()).isEqualTo(test.getHotel().getHotelName());
        assertThat(test.getInvoicePage().getHotelLocation()).isEqualTo(test.getHotel().getLocation());
        assertThat(test.getInvoicePage().getHotelRoom()).isEqualTo(test.getHotel().getRoomName());
        assertThat(test.getInvoicePage().getHotelCheckInDate()).isEqualTo(test.getHotel().getCheckInDate());
        assertThat(test.getInvoicePage().getHotelCheckOutDate()).isEqualTo(test.getHotel().getCheckOutDate());
    }
}
