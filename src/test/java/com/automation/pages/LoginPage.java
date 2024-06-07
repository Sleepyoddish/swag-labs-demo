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
        Assert.assertTrue(driver.findElement(By.cssSelector(".login_credentials")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(".login_password")).isDisplayed());
    }

    public void loginStandardUser() {

        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".title"))));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    public void loginLockedOutUser() {
        driver.findElement(By.cssSelector("#user-name")).sendKeys("locked_out_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".error-message-container")).isDisplayed());
        driver.navigate().refresh();

    }

}
