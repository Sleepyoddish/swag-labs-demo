package com.automation.pages;

import com.automation.support.ProductEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ProductPage extends BasePage {

    BasePage basepage = new BasePage();


    @FindBy(css = ".inventory_details_img")
    WebElement itemImg;

    @FindBy(css = ".inventory_details_name")
    WebElement itemName;

    @FindBy(css = ".inventory_details_desc")
    WebElement itemDescription;

    @FindBy(css = ".inventory_details_price")
    WebElement itemPrice;

    @FindBy(css = "#add-to-cart")
    WebElement addButton;
    @FindBy(css = "#remove")
    WebElement removeButton;

    @FindBy(css = "#back-to-products")
    WebElement backButton;

    @FindBy(css = ".shopping_cart_badge")
    WebElement shoppingCartBadge;


    public void verifyProductPage(By link, ProductEnum product) {
        WebElement itemLink = driver.findElement(link);
        itemLink.click();
        Assert.assertEquals(driver.getCurrentUrl(), product.getUrl());
        Assert.assertEquals(itemName.getText(), product.getTitle());
        Assert.assertEquals(itemDescription.getText(), product.getDescription());
        Assert.assertEquals(itemPrice.getText(), product.getPrice());
        Assert.assertEquals(addButton.getText(), product.getButton());
        addButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge.getText(), "1");
        removeButton.click();
        wait.until(ExpectedConditions.invisibilityOf(shoppingCartBadge));
        Assert.assertTrue(addButton.isDisplayed());
        driver.navigate().back();
    }
}
