package pages.hotel;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.invoice.InvoicePageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HotelReservationConfirmationPageObject {

    private SelenideElement getConfirmThisBookingButton() {
        return $("button[name='logged']");
    }

    private SelenideElement getFirstNameField() {
        return $(By.xpath("//label[contains(text(), 'First Name')]/following::input[1]"));
    }

    private SelenideElement getLastNameField() {
        return $(By.xpath("//label[contains(text(), 'Last Name')]/following::input[1]"));
    }

    private SelenideElement getEmailField() {
        return $(By.xpath("//label[contains(text(), 'Email')]/following::input[1]"));
    }

    private SelenideElement getHotelNameField() {
        return $("h6.m0");
    }

    private SelenideElement getHotelLocationField() {
        return $(By.xpath("//p[./i[contains(@class, 'fa fa-map-marker RTL')]]"));
    }

    private SelenideElement getCheckInDateField() {
        return $(By.xpath("//li[./b[contains(text(),'Check in')]]/span"));
    }

    private SelenideElement getCheckOutDateField() {
        return $(By.xpath("//li[./b[contains(text(),'Check out')]]/span"));
    }

    private SelenideElement getHotelRoomField() {
        return $(By.xpath("//p[./i[contains(@class,'fa fa-bed')]]/strong"));
    }

    private SelenideElement getAdultField() {
        return $(By.xpath("//p[./i[contains(@class,'fa fa-bed')]]/span"));
    }

    public InvoicePageObject selectConfirmThisBookingButton() {
        getConfirmThisBookingButton().scrollTo().click();
        return page(InvoicePageObject.class);
    }

    public boolean isConfirmButtoVisible() {
        return getConfirmThisBookingButton().isDisplayed();
    }

    public String getFirstName() {
        return getFirstNameField().val();
    }

    public String getLastName() {
        return getLastNameField().val();
    }

    public String getEmail() {
        return getEmailField().val();
    }

    public String getHotelName() {
        return getHotelNameField().text();
    }

    public String getHotelLocation() {
        return getHotelLocationField().text();
    }

    public String getHotelCheckInDate() {
        return getCheckInDateField().text();
    }

    public String getHotelCheckOutDate() {
        return getCheckOutDateField().text();
    }

    public String getHotelRoom() {
        return getHotelRoomField().text();
    }

    public String getHotelAdultCount() {
        return getAdultField().getText().substring(4, 5);
    }

}
