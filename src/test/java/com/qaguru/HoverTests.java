package com.qaguru;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HoverTests extends TestBase {

    @Test
    void openEnterprize () {
        open("https://github.com");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $(byTagAndText("a","Enterprise")).click();
        $("h1").shouldHave(text("Build like the best"));
    }
}
