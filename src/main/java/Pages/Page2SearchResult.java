package Pages;

import runners.AddBlocks;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class Page2SearchResult {
    public static void chooseCategory() {

        // close banner if visible
        AddBlocks.closeBanners();

        // choose 1st offered category in sidebar
        if ($(byId("search-sidebar")).$("div.ait-search-categories-block").$("div:nth-child(2)").exists()) {
            $("#search-sidebar > div.ait-search-categories-content > div > div:nth-child(1) > ul > li:nth-child(1) > a").scrollTo().hover().click();
                //$(byId("search-sidebar")).$("div.ait-search-categories-block").$("div:first-child").$("*:nth-child(1)").$("*:first-child").scrollTo().hover().click(); // need to improve
            System.out.println("at least 2 categories / div:nth-child(2) EXIST");
        }else{

            $(byId("search-sidebar")).$("div.ait-search-categories-block").$("div:first-child").$("*:nth-child(2)").scrollTo().hover().click();
                //$(byId("search-sidebar")).$("div.ait-search-categories-block").$("*:nth-child(2)").scrollTo().hover().click(); // working
            System.out.println("1 category / div:nth-child(2) NOT EXIST");
        }
    }
}
