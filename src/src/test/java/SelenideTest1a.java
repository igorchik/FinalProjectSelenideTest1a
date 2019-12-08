import Models.Customer;
import Models.Product;
import Models.ProductCategory;
import Pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import runners.Common;

import static com.codeborne.selenide.Selenide.close;

public class SelenideTest1a extends Common{

    @Before
    public void setup() {

        // product category name input
        ProductCategory productCategory = new ProductCategory();
        productCategory.setProductCategory("tv");

        // product producer input
        Product product = new Product();
        product.setProductProducer("TCL");

        // customer data input
        Customer customer = new Customer();
        customer.setCustomerName("Janis");
        customer.setCustomerSurname("Ivanovs");
        customer.setCustomerEmail("janis.ivanovs@test.lv");
        customer.setCustomerPhone("12345678");


        // TESTED combinations [category + producer]. NOTICE - producer's name must be the same as in shop. CASE sensitive.

        // konstruktors + Technic [OR] The Lego Movie [OR]...
        // televizors + Samsung [OR] LG [OR] Thomson [OR] TLC
        // TV + Samsung [OR] LG [OR] Thomson [OR] TLC
        // telefons + Xiaomi [OR] Samsung [OR] LG
        // zobu birste + Philips [OR] Braun [OR] Sencor
        // dators + Lenovo
        // portativais dators + HP [OR] Lenovo [OR] Acer
        // magnetola + Sencor [OR] Sony

        Common.startBrowser(); // start browser
    }

    @After
    public void dropTest(){
        Common.stopBrowser();
        close();
        // SimpleReport();
    }

    @Test
    public void selenideTest() {

        Page1Main.searchProduct(); // search product by type
        Page2SearchResult.chooseCategory(); // choose product category
        Page3Category.chooseProducer(); // choose producer, choose product with the greatest rating
        Page4Product.productBuy(); // go to product page, add to cart, get product price and name
        Page5Cart1.cartStep1();// cart filling, step 1 - skip
        Page6Cart2.cartStep2(); // cart filling, step 2 - skip login
        Page7Cart3.cartStep3(); // cart filling, step 3 - fill customer data
        Page8Cart4.cartStep4(); // cart filling, step 4 - choose payment method
        Page9CartFinalValidation.cartFinal(); // validate all datas

    }

}

// TESTED combinations [category - producer]
// konstruktors - Technic
// konstruktors - The Lego Movie