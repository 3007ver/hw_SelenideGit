package com.qaguru;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideInGitTest extends TestBase {
    @Test
    void SoftAssertionsSearchTests () {
        open("https://github.com");
        $("[placeholder = 'Search GitHub']").setValue("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("#wiki-tab").click();
        //$("#wiki-pages-box").$(byText("Show 2 more pages...")).click();
        $("#wiki-body").shouldHave(text("Soft assertions"));
        $("#wiki-body").$(byText("Soft assertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));



    }
}
