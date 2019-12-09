package Pages;

import static com.codeborne.selenide.Selenide.$;

public class Page6CartLogin {
    public static void cartStep2(){

        // button NEXT
        $("div.col.not-reg").$("a.button.btn-v2").click();

    }
}
