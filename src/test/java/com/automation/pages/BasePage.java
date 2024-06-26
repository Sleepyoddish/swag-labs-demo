package com.automation.pages;

import com.automation.support.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage() {
        driver = DriverUtils.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
}
