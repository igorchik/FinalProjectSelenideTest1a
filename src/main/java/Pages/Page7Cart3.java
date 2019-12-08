package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static Models.Customer.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Page7Cart3 {
    public static void cartStep3(){

        sleep(1000);

        // input customer's name
        $(byId("order_main_data_name")).sendKeys(customerName);

        // input customer's surname
        $(byId("order_main_data_surname")).sendKeys(customerSurname);

        // input customer's e-mail
        $(byId("order_main_data_email")).sendKeys(customerEmail);

        // input customer's phone number
        $(byId("order_main_data_contact_phone_number")).sendKeys(customerPhone);

        //hidden selectbox (not working because invisible)
        //$("div.unit").$(byId("order_main_data_advertisement_subscription_type")).selectOptionByValue("NONE");

        // news decline
        SelenideElement newsAccept = $(byXpath("//*[@id=\"order_form\"]/div[2]/div[1]/div[2]/section/div[1]/div[1]/div[3]/span/input"));
        newsAccept.click();
        newsAccept.sendKeys("Nev\u0113los sa\u0146emt");

        // purchase agreement checkbox
        $(byId("accept_purchase_agreement")).scrollTo().click();

        // choose delivery method, work with 2 types of delivery method tables
        SelenideElement deliveryMethods = $(byId("available_delivery_types_container"));
        if (deliveryMethods.$(byText("R\u012bga, M\u016bkusalas 41 - 2.st\u0101vs")).exists()) {
            deliveryMethods.$(byText("R\u012bga, M\u016bkusalas 41 - 2.st\u0101vs")).scrollTo().hover().click();
        }else{
            deliveryMethods.$(byText("M\u016aKUSALA")).scrollTo().hover().click();
        }

        Selenide.sleep(1000);

        // button NEXT
        $("div.ait-checkout-footer").$("a.ait-button.ait-button-primary.order-form-forward-button").scrollTo().click();

    }
}
