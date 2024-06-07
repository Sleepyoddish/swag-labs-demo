package com.automation.pages;

import com.automation.support.LoginEnum;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePage {

    @FindBy(css = ".login_logo")
    WebElement header;
    @FindBy(css = "#user-name")
    WebElement usernameField;
    @FindBy(css = "#password")
    WebElement passwordField;
    @FindBy(css = "#login-button")
    WebElement loginButton;
    @FindBy(css = ".login_credentials")
    WebElement loginCredentials;
    @FindBy(css = ".login_password")
    WebElement loginPassword;
    @FindBy(css = ".error-message-container")
    WebElement errorMessage;
    @FindBy(css = ".title")
    WebElement productsTitle;


    public void checkPageTitleText() {
        Assert.assertTrue(header.isDisplayed());
        Assert.assertEquals(header.getText(), LoginEnum.LOGIN_HEADER.getName());
    }

    public void verifyLoginCredentials() {
        Assert.assertTrue(loginCredentials.isDisplayed());
        Assert.assertTrue(loginPassword.isDisplayed());
    }

    public void loginStandardUser() {
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
        wait.until(ExpectedConditions.visibilityOf(productsTitle));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    public void loginLockedOutUser() {
        usernameField.sendKeys("locked_out_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
        Assert.assertTrue(errorMessage.isDisplayed());
        driver.navigate().refresh();

    }

}
