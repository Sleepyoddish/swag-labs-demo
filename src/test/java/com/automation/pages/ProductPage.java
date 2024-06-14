package com.automation.pages;

import com.automation.support.ProductEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ProductPage extends BasePage {

    public void verifyProductPage(By link, ProductEnum product) {
        driver.findElement(link).click();
        Assert.assertEquals(driver.getCurrentUrl(), product.getUrl());
        Assert.assertTrue(driver.findElement(By.cssSelector(".inventory_details_img")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.cssSelector(".inventory_details_name")).getText(), product.getTitle());
        Assert.assertEquals(driver.findElement(By.cssSelector(".inventory_details_desc")).getText(), product.getDescription());
        Assert.assertEquals(driver.findElement(By.cssSelector(".inventory_details_price")).getText(), product.getPrice());
        WebElement actionButton = driver.findElement(By.cssSelector("#add-to-cart"));
        Assert.assertEquals(driver.findElement(By.cssSelector("#add-to-cart")).getText(), product.getButton());
        actionButton.click();
        WebElement shoppingCartBadge = driver.findElement(By.cssSelector(".shopping_cart_badge"));
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge.getText(), "1");
        driver.navigate().refresh();
        actionButton = driver.findElement(By.cssSelector("#remove"));
        actionButton.click();
        wait.until(ExpectedConditions.invisibilityOf(shoppingCartBadge));
        actionButton = driver.findElement(By.cssSelector("#add-to-cart"));
        Assert.assertTrue(actionButton.isDisplayed());
        driver.findElement(By.cssSelector("#back-to-products")).click();
    }
}
