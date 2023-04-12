package com.qaguru;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {

    @BeforeAll
    static void BeforeAll() {
        Configuration.browserPosition = "0x0";
        Configuration.holdBrowserOpen = true;



    }
}