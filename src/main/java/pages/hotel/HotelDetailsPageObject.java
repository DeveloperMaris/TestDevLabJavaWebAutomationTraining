package pages.hotel;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HotelDetailsPageObject {

    private SelenideElement getHotelRoomBookNowButton(String roomName) {
        return $(By.xpath("//section[@id='ROOMS']/descendant::td[.//*[contains(text(), '" + roomName + "')]]/descendant::button[@type='submit']"));
    }

    private SelenideElement getHotelDetailsSection() {
        return $("#OVERVIEW");
    }

    private SelenideElement getModifyButton() {
        return $("input[type='submit']");
    }

    private SelenideElement getHotelNameObject() {
        return $(".header-mob .ellipsis.ttu span");
    }

    private SelenideElement getHotelLocationObject() {
        return $(".header-mob .RTL");
    }

    private SelenideElement getCheckInDateField() {
        return $("input[name='checkin'].form-control.dpd1rooms");
    }

    private SelenideElement getCheckOutDateField() {
        return $("input[name='checkout'].form-control.dpd2rooms");
    }

    private SelenideElement getAdultSelect() {
        return $("#adults");
    }

    private SelenideElement getChildSelect() {
        return $("#child");
    }

    private SelenideElement getHotelRoomTable() {
        return $("#ROOMS table.table > form");
    }

    public HotelReservationConfirmationPageObject selectHotelRoomBookNowButton(String hotelName) {
        getHotelRoomBookNowButton(hotelName).scrollTo().click();
        return page(HotelReservationConfirmationPageObject.class);
    }

    public boolean isModifyButtonVisible() {
        return getModifyButton().isDisplayed();
    }

    public String getHotelName() {
        return getHotelNameObject().text();
    }

    public String getHotelLocation() {
        return getHotelLocationObject().text();
    }

    public String getCheckInDate() {
        return getCheckInDateField().val();
    }

    public String getCheckOutDate() {
        return getCheckOutDateField().val();
    }

    public String getAdultValue() {
        return getAdultSelect().val();
    }

    public String getChildValue() {
        return getChildSelect().val();
    }

}
