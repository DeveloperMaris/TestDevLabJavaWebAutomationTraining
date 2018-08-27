package general;

import lombok.Data;
import pages.account.AccountPageObject;
import pages.header.NavigationPageObject;
import pages.hotel.HotelDetailsPageObject;
import pages.hotel.HotelReservationConfirmationPageObject;
import pages.invoice.InvoicePageObject;
import pages.landingPage.BookHotelsPageObject;
import pages.login.LoginPageObject;
import pages.signup.SignUpPageObject;

@Data
public class TestContext {

    private User user;
    private Hotel hotel;
    private AccountPageObject accountPage;
    private NavigationPageObject navigation;
    private BookHotelsPageObject bookHotelsPage;
    private LoginPageObject loginPage;
    private SignUpPageObject signUpPage;
    private HotelDetailsPageObject hotelDetailsPage;
    private HotelReservationConfirmationPageObject hotelReservationConfirmationPage;
    private InvoicePageObject invoicePage;

    public TestContext() {
        this.user = new User();
        this.hotel = new Hotel();
        this.accountPage = new AccountPageObject();
        this.navigation = new NavigationPageObject();
        this.bookHotelsPage = new BookHotelsPageObject();
        this.loginPage = new LoginPageObject();
        this.signUpPage = new SignUpPageObject();
        this.hotelDetailsPage = new HotelDetailsPageObject();
        this.hotelReservationConfirmationPage = new HotelReservationConfirmationPageObject();
        this.invoicePage = new InvoicePageObject();
    }

}
