package Pages;

import static com.codeborne.selenide.Selenide.$;

public class Page5Cart1 {
    public static void cartStep1(){

        // button NEXT
        $("div.ait-checkout-header").$("a.ait-button.ait-button-primary.order-form-forward-button").click();
    }
}
