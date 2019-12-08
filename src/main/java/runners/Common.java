package runners;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.PageLoadStrategy.NORMAL;

public class Common {

    public static void startBrowser() {

        //Configuration.headless = true;
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = true;
        open("https://www.1a.lv/");
        //Configuration.assertionMode = AssertionMode.SOFT;
        Configuration.pageLoadStrategy = String.valueOf(NORMAL);

        sleep(5000);
    }

    public static void stopBrowser(){
        close();
    }
}
