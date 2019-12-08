package Pages;

import Models.Product;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import runners.AddBlocks;

import static Models.Product.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class Page4Product {
    public static void productBuy(){

        // close banner if visible
        AddBlocks.closeBanners();

        // get product name
        setProductName($("div.product-main-info").$("h1").getAttribute("innerText"));

        // add to cart
        $(byId("add_product_to_shopping_cart_button_top")).click();

        // get product price
        SelenideElement shoppingCart = $(byId("shopping_cart_container"));
        shoppingCart.scrollTo().$("span.items").shouldHave(Condition.exactText("1"));
        shoppingCart.hover();
        setProductPrice($("span.price").getAttribute("innerText"));

        // go to cart
        shoppingCart.click();

        // info to console
        System.out.println("----- product data from product page -----");
        System.out.println(Product.productName + " >>> price is " + Product.productPrice + " >>> producer >>> " + productProducer);
        System.out.println();

    }
}
