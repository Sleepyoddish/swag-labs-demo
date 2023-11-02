package com.automation.maps;

import com.automation.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageMap extends BasePage {
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
}
