package pages.hotel;

import com.codeborne.selenide.SelenideElement;
import pages.invoice.InvoicePageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HotelReservationConfirmationPageObject {

    private SelenideElement getConfirmThisBookingButton() {
        return $("button[name='logged']");
    }

    public InvoicePageObject selectConfirmThisBookingButton() {
        getConfirmThisBookingButton().scrollTo().click();
        return page(InvoicePageObject.class);
    }

}
