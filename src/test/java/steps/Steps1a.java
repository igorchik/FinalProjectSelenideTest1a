package steps;

import Models.Customer;
import Models.Product;
import Models.ProductCategory;
import Pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runners.Common;

public class Steps1a {
    @Given("I enter customers data like {string}, {string}, {string} and {string}")
    public void iEnterCustomersDataLikeNameSurnameEMailAndPhone(String name, String surname, String email, String phone) {
        Customer customer = new Customer();
        customer.setCustomerName(name);
        customer.setCustomerSurname(surname);
        customer.setCustomerEmail(email);
        customer.setCustomerPhone(phone);
    }

    @And("I open browser and 1a web store")
    public void iOpenBrowserAndAWebStore() {
        Common.startBrowser();
    }

    @When("I search for product {string}")
    public void iSearchForProductTelevizors(String categorySearch) {
        ProductCategory category = new ProductCategory();
        category.setProductCategory(categorySearch);
        Page1Main.searchProduct();
    }

    @And("I get search results I choose first category")
    public void iGetSearchResultsIChooseFirstCategory() {
        Page2SearchResult.chooseCategory();
    }

    @And("I choose producer {string} and sort by rating and go to the most valuated product page")
    public void iChooseProducerSamsungAndSortByRatingAndGoToTheMostValuatedProductPage(String productProducer) {
        Product product = new Product();
        product.setProductProducer(productProducer);
        Page3Category.chooseProducer();
    }

    @And("In product page I read data like product name and price and add this product to cart")
    public void inProductPageIReadDataLikeProductNameAndPriceAndAddThisProductToCart() {
        Page4Product.productBuy();
    }

    @Then("I enter cart I press button Next")
    public void iEnterCartIPressButtonNext() {
        Page5CartEnter.cartStep1();
    }

    @And("In second step I skip registration and choose option without registration")
    public void inSecondStepISkipRegistrationAndChooseOptionWithoutRegistration() {
        Page6CartLogin.cartStep2();
    }

    @And("In third step I fill form with data from Models.Customer and choose delivery method")
    public void inThirdStepIFillFormWithDataFromModelsCustomerAndChooseDeliveryMethod() {
        Page7CartDelivery.cartStep3();
    }

    @And("In fourth step I choose payment method by cash")
    public void inFourthStepIChoosePaymentMethodByCash() {
        Page8CartPaymentType.cartStep4();
    }

    @And("In final step I run data validation and assert that product price and name from product card is the same as in cart, also validate customers data")
    public void inFinalStepIRunDataValidationAndAssertThatProductPriceAndNameFromProductCardIsTheSameAsInCartAlsoValidateCustomersData() {
        Page9CartConfirmation.cartFinal();
    }

    @And("I stop driver")
    public void iStopDriver() {
        Common.stopBrowser();
    }
}
