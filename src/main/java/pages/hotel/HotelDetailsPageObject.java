package pages.hotel;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HotelDetailsPageObject {

    private SelenideElement getHotelRoomBookNowButton(String roomName) {
        return $(By.xpath("//section[@id='ROOMS']/descendant::td[.//*[contains(text(), '" + roomName + "')]]/descendant::button[@type='submit']"));
    }

    public HotelReservationConfirmationPageObject selectHotelRoomBookNowButton(String hotelName) {
        getHotelRoomBookNowButton(hotelName).scrollTo().click();
        return page(HotelReservationConfirmationPageObject.class);
    }

}
