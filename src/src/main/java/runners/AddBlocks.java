package runners;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AddBlocks {

    public static void closeBanners (){
        SelenideElement popUpBanner = $(byId("mt-65cf2a318dbd5e21"));
        if (popUpBanner.is(visible)) {
        Selenide.switchTo().frame(popUpBanner);
        $(byXpath("/html/body/div[1]/div/div/a")).shouldBe(visible).hover().click();
        }else{
        Selenide.switchTo().defaultContent();
        } // close pop-up banner

        //SelenideElement bottomBanner = $(byId("mt-b832a55b5fb34368"));
        //if (bottomBanner.is(visible)){
        //    Selenide.switchTo().frame(bottomBanner);
        //   $(byId("slider-image")).$(By.className("close-button-slider desktop")).shouldBe(visible).hover().click();
        //} else {
        //    Selenide.switchTo().defaultContent();
        //} // close bottom banner

        //SelenideElement cookieBanner = $(byId("cookiebanner"));
        //if (cookieBanner.is(visible)) {
        //   Selenide.switchTo().defaultContent();
        //   cookieBanner.$(byXpath("//*[@id=\"cookie-btns\"]/a[1]")).shouldBe(visible).hover().click();
        //}else{}// close cookie banner
    }
}
