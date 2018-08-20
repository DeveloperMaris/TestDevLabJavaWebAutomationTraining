package pages.landingPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BookHotelsPageObject {

    private SelenideElement getBookHotelsButton() {
        return $("li[data-title='HOTELS'] > a");
    }

    private SelenideElement getHotelTextField() {
        return $("#s2id_autogen9");
    }

    private SelenideElement getHotelElementFromList(String hotel) {
        return $(By.xpath("//ul[@class='select2-result-sub']//li[//*[contains(text(), '" + hotel + "')]]"));
    }

    private SelenideElement getCheckInTextField() {
        return $("input[name='checkin']");
    }

    private SelenideElement getCheckOutTextField() {
        return $("input[name='checkout']");
    }

    public void selectBookHotelsButton() {
        getBookHotelsButton().click();
    }

    public void selectHotelField() {
        getHotelTextField().click();
    }

    public void enterHotelName(String name) {
        getHotelTextField().sendKeys(name);
    }

    public void selectHotelFromList(String hotel) {
        getHotelElementFromList(hotel).click();
    }

    public void enterCheckInDate(String day, String month, String year) {
        getCheckInTextField().sendKeys(day + "/" + month + "/" + year);
    }

    public void enterCheckOutDate(String day, String month, String year) {
        getCheckOutTextField().sendKeys(day + "/" + month + "/" + year);
    }
}
