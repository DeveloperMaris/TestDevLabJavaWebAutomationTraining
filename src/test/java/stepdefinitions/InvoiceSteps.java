package stepdefinitions;

import cucumber.api.java.en.*;
import general.TestContext;

public class InvoiceSteps {

    private TestContext test;

    public InvoiceSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Then("^Unpaid invoice page is opened$")
    public void unpaidInvoicePageIsOpened() {
        System.out.println("INVOICE IS SENT TO YOUR MAIL. PLEASE FOLLOW THE INSTRUCTIONS.");
    }

}
