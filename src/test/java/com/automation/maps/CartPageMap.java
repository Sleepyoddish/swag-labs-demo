package com.automation.maps;

import com.automation.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageMap extends BasePage {
    @FindBy(css = ".app_logo")
    WebElement appLogo;
    @FindBy(css = ".title")
    WebElement pageTitle;
    @FindBy(css = ".cart_quantity_label")
    WebElement cartQuantity;
    @FindBy(css = ".cart_desc_label")
    WebElement cartDescription;
    @FindBy(css = ".cart_list")
    WebElement cartList;
    @FindBy(css = "#continue-shopping")
    WebElement continueShoppingButton;
    @FindBy(css = "#checkout")
    WebElement checkoutButton;
}
