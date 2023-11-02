package com.automation.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverUtils {

    static WebDriver driver;

    public static void createDriver() {
        if (ConfigReader.getProperty("application.host").equalsIgnoreCase("local")) {
            if (driver == null) {
                String chromeDriverPath = ConfigReader.getProperty("chromedriver.path");
                System.setProperty("chromedriver.path", chromeDriverPath);
                driver = new ChromeDriver();
            }

        }
        driver.get(ConfigReader.getProperty("application.url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    //This method simply returns the current WebDriver instance (driver).
    //It allows other classes or methods in your automation framework to access the same WebDriver instance that was created by the createDriver method.
    public static WebDriver getDriver() {
        return driver;
    }

}
