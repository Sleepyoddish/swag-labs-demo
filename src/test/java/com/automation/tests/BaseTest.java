package com.automation.tests;

import com.automation.pages.CartPage;
import com.automation.pages.LandingPage;
import com.automation.pages.LoginPage;
import com.automation.pages.ProductPage;
import com.automation.support.ConfigReader;
import com.automation.support.DriverUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    CartPage cartPage;
    LandingPage landingPage;
    LoginPage loginPage;
    ProductPage productPage;

    @BeforeClass
    public void setUp() {
        ConfigReader.initProperty();
        DriverUtils.createDriver();
        // when the Objects of these pages get instantiated, the Constructor of their Parent Page (BasePage) will get called (Constructor chaining concept)
        // when the BasePage Constructor gets called it will get the driver, initialize its web elements with the help of the PageFactory
        loginPage = new LoginPage();
        landingPage = new LandingPage();
        cartPage = new CartPage();
        productPage = new ProductPage();

    }

    @AfterClass
    public void cleanUp() {
        DriverUtils.getDriver().close();
    }

}
