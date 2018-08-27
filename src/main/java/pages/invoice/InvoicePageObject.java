package pages.invoice;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InvoicePageObject {

    private SelenideElement getInvoiceTitle() {
        return $(By.xpath("//table[@id='invoiceTable']/descendant::div[contains(text(), 'Invoice')]"));
    }

    private SelenideElement getUnpaidTitle() {
        return $(By.xpath("//table[@id='invoiceTable']/descendant::div[contains(text(), 'Unpaid')]"));
    }

    private SelenideElement getHotelNameField() {
        return $(By.xpath("//table[@id='invoiceTable']/descendant::td[./i[contains(@class, 'star')]]"));
    }

    private SelenideElement getHotelLocationField() {
        return $(By.xpath("//table[@id='invoiceTable']/descendant::tr[td[./i[contains(@class, 'star')]][1]]//td[2]"));
    }

    private SelenideElement getHotelRoomField() {
        return $(By.xpath("//table[@id='invoiceTable']/descendant::td[contains(text(), 'Room :')]"));
    }

    private SelenideElement getCheckInField() {
        return $(By.xpath("//table[@id='invoiceTable']//descendant::tr[./td/strong[contains(text(), 'Check in')]]/td[2]"));
    }

    private SelenideElement getCheckOutField() {
        return $(By.xpath("//table[@id='invoiceTable']//descendant::tr[./td/strong[contains(text(), 'Check out')]]/td[2]"));
    }

    public void waitUntilInvoiceTitleIsDisplayed() {
        getInvoiceTitle().waitUntil(Condition.visible, 5000);
    }

    public SelenideElement getUnpaidElement() {
        return getUnpaidTitle();
    }

    public String getHotelName() {
        return getHotelNameField().text();
    }

    public String getHotelLocation() {
        return getHotelLocationField().text();
    }

    public String getHotelRoom() {
        return getHotelRoomField().getText().substring(7);
    }

    public String getHotelCheckInDate() {
        return getCheckInField().text();
    }

    public String getHotelCheckOutDate() {
        return getCheckOutField().text();
    }

}
