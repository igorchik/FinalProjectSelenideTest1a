package Pages;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class Page8Cart4 {
    public static void cartStep4(){

        // choose payment method
        $(byId("order_form")).$("div.payment-form").$("div.select-method").scrollTo().$("nav.method-list").$(byText("Skaidra nauda")).click();

        // button NEXT
        $("div.ait-checkout-footer").$("a.ait-button.ait-button-primary.order-form-forward-button").scrollTo().click();

    }
}
