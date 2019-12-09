package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import runners.AddBlocks;

import static Models.Product.getProductProducer;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Page3Category {
    public static void chooseProducer() {

        // close banner if visible
        AddBlocks.closeBanners();

        // find and choose producer
        SelenideElement producerList = $("div.items-holder.always-visible.ps-container.ps-theme-default.ps-active-y");
                //SelenideElement producerList = $(byAttribute("data-attribute-id","1431")).should(Condition.exist);
                //SelenideElement producerList = $(byAttribute("data-attribute-id","1664")).should(Condition.exist);
                //SelenideElement producerList = $(byId("search-sidebar")).$(byText("Ra\u017eot\u0101js")).parent().parent();

        producerList.scrollTo();

        if (producerList.$(withText(getProductProducer())).scrollTo().is(Condition.visible)) {
            System.out.println("Producer checkbox is VISIBLE");
            producerList.$(withText(getProductProducer())).scrollTo().parent().shouldNotBe(Condition.checked).click();
        } else {
            System.out.println("Producer checkbox is NOT VISIBLE. Manual search");
            $("#product_filter_block > div > div.filter-data > div:nth-child(4) > div.category-items > div.search > input").scrollTo().sendKeys(getProductProducer());
            $(byText(getProductProducer())).hover().doubleClick();
                //$("div.category-items").$("div:first-child").$("*:first-child").scrollTo().sendKeys(getProductProducer());
                //$("#product_filter_block > div > div.filter-data > div:nth-child(4) > div.category-items > div.items-holder.always-visible.ps-container.ps-theme-default > div:nth-child(25) > label > span > span.product-attribute-value > span").hover().doubleClick();
                //$(byAttribute("data-attribute-id","1431")).$(byAttribute("data-cattr-id", "1431")).$(byAttribute("type", "checkbox")).$("span.highlight").$(byText(getProductProducer())).scrollTo().hover().doubleClick();
        }

        // sort by most valuated first
        SelenideElement sortSelect = $("div.filter-products.toolbar").$("fieldset:nth-child(2)");
                //SelenideElement sortSelect = $("div.select-sort-products.select-product-sort-list.selectArea");
                //SelenideElement sortSelect = $("div#product_search_grid_container.grid-container").shouldBe(Condition.visible).$("div.paging-holder").$("fieldset:nth-child(2)");
                //SelenideElement sortSelect = $(byId("product_search_grid_container")).shouldBe(Condition.visible).$("div.paging-holder").$("fieldset:nth-child(2)"); // working, but not in headless

        sortSelect.scrollTo().hover().click();
        sortSelect.click(0, 130);
        sleep(1000);

        // go to most valuated product page
        $("div.product-grid.search-products").$("section:nth-child(1)").$("div.p-image").scrollTo().hover().click();
                //$(byId("product_search_grid_container")).$("div.product-grid.search-products").$("section:nth-child(1)").$("div.p-image").scrollTo().hover().click();
    }
}
