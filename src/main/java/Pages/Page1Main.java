package Pages;

import Models.ProductCategory;
import org.openqa.selenium.By;
import runners.AddBlocks;
import runners.Common;

import static com.codeborne.selenide.Selenide.$;

public class Page1Main extends Common {

    public static void searchProduct() {

        // close banner if visible
        AddBlocks.closeBanners();

        // enter product name in search bar

        $(By.id("search_products_text_field")).sendKeys(ProductCategory.getProductCategory());
        $(By.id("search_products_text_field")).submit();

    }
}