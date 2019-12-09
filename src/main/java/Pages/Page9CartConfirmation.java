package Pages;

import Models.Customer;
import Models.Product;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Page9CartConfirmation {
    public static void cartFinal(){

        // print product data to validate
        System.out.println("----- product data to validate -----");
        System.out.println(Product.productName);
        System.out.println(Product.productPrice);

        System.out.println();
        System.out.println("----- customer data to validate -----");

        // print customer data to validate
        System.out.println(Customer.customerName + " " + Customer.customerSurname);
        System.out.println(Customer.customerEmail);
        System.out.println(Customer.customerPhone);

        System.out.println();
        System.out.println("----- product data from cartFinal -----");

        // product data validation
        SelenideElement producNameToValidate = $("div.ait-cart-item-info").$("h4");
        producNameToValidate.shouldBe(Condition.exactText(Product.productName));
        System.out.println(producNameToValidate.getText());

        SelenideElement productPriceToValidate = $("span.ait-cart-price");
        productPriceToValidate.shouldBe(Condition.exactText(Product.productPrice));
        System.out.println(productPriceToValidate.getText());
        System.out.println("##### DATA VALIDATED ##### TEST PASSED #####");

        System.out.println();
        System.out.println("----- customer data from cartFinal -----");

        // customer data validation
        SelenideElement customerDataToValidate = $("div.cart-info").$("div.three-cols").$("div.col-1").$("p");
        customerDataToValidate.shouldHave(Condition.text(Customer.customerName)).shouldHave(Condition.text(Customer.customerSurname)).shouldHave(Condition.text(Customer.customerEmail)).shouldHave(Condition.text(Customer.customerPhone));
        System.out.println(customerDataToValidate.getText());
        System.out.println("##### DATA VALIDATED ##### TEST PASSED #####");

        System.out.println();
        System.out.println("----- TEST END -----");
        System.out.println();

    }
}
