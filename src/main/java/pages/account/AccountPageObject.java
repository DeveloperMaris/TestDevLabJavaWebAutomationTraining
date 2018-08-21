package pages.account;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AccountPageObject {

    private SelenideElement getAccountDataField() {
        return $(".RTL h3");
    }

    public String getAccountName() {
        return getAccountDataField().getText().split(" ")[1];
    }

    public String getAccountLastname() {
        return getAccountDataField().getText().split(" ")[2];
    }

}
