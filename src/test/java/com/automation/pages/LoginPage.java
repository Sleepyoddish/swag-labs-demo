package com.automation.pages;

import com.automation.support.LoginEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePage {

    public void checkPageTitleText() {
        WebElement header = driver.findElement(By.cssSelector(".login_logo"));
        Assert.assertTrue(header.isDisplayed());
        Assert.assertEquals(header.getText(), LoginEnum.LOGIN_HEADER.getName());
    }

    public void verifyLoginCredentials() {
        WebElement loginCredentials = driver.findElement(By.cssSelector(".login_credentials"));
        Assert.assertTrue(loginCredentials.isDisplayed());
        WebElement loginPassword = driver.findElement(By.cssSelector(".login_password"));
        Assert.assertTrue(loginPassword.isDisplayed());
    }

    public void loginStandardUser() {
        WebElement usernameField = driver.findElement(By.cssSelector("#user-name"));
        usernameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.cssSelector("#password"));
        passwordField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));
        loginButton.click();
        WebElement productsTitle = driver.findElement(By.cssSelector(".title"));
        wait.until(ExpectedConditions.visibilityOf(productsTitle));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    public void loginLockedOutUser() {
        WebElement usernameField = driver.findElement(By.cssSelector("#user-name"));
        usernameField.sendKeys("locked_out_user");
        WebElement passwordField = driver.findElement(By.cssSelector("#password"));
        passwordField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.cssSelector("#login-button"));
        loginButton.click();
        WebElement errorMessage = driver.findElement(By.cssSelector(".error-message-container"));
        Assert.assertTrue(errorMessage.isDisplayed());
        driver.navigate().refresh();

    }

}
