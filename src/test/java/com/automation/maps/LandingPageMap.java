package com.automation.maps;

import com.automation.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPageMap extends BasePage {
    //LANDING PAGE
    @FindBy(css = ".app_logo")
    WebElement appLogo;
    @FindBy(css = ".title")
    WebElement pageTitle;
    @FindBy(css = ".product_sort_container")
    WebElement sortButton;

    //SHOPPING CART
    @FindBy(css = ".shopping_cart_link")
    WebElement shoppingCartLink;
    @FindBy(css = ".shopping_cart_badge")
    WebElement shoppingCartBadge;

    //HAMBURGER MENU
    @FindBy(css = "#react-burger-menu-btn")
    WebElement hamburgerMenuButton;
    @FindBy(css = "#inventory_sidebar_link")
    WebElement allItemsButton;
    @FindBy(css = "#about_sidebar_link")
    WebElement aboutButton;
    @FindBy(css = "#logout_sidebar_link")
    WebElement logoutButton;

    //BACKPACK
    @FindBy(css = "#item_4_img_link")
    WebElement backpackImage;
    @FindBy(css = "#item_4_title_link")
    WebElement backpackTitle;
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[1]/div")
    WebElement backpackDescription;
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")
    WebElement backpackPrice;
    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    WebElement backpackButton;
    @FindBy(css = "#remove-sauce-labs-backpack")
    WebElement removeBackpackButton;

    //BIKE LIGHT
    @FindBy(css = "#item_0_img_link")
    WebElement bikeImage;
    @FindBy(css = "#item_0_title_link")
    WebElement bikeTitle;
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[1]/div")
    WebElement bikeDescription;
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div")
    WebElement bikePrice;
    @FindBy(css = "#add-to-cart-sauce-labs-bike-light")
    WebElement bikeButton;
    @FindBy(css = "#remove-sauce-labs-bike-light")
    WebElement removeBikeButton;

    //SHIRT
    @FindBy(css = "#item_1_img_link")
    WebElement shirtImage;
    @FindBy(css = "#item_1_title_link")
    WebElement shirtTitle;
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[1]/div")
    WebElement shirtDescription;
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div")
    WebElement shirtPrice;
    @FindBy(css = "#add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement shirtButton;
    @FindBy(css = "#remove-sauce-labs-bolt-t-shirt")
    WebElement removeShirtButton;

    //FLEECE
    @FindBy(css = "#item_5_img_link")
    WebElement fleeceImage;
    @FindBy(css = "#item_5_title_link")
    WebElement fleeceTitle;
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[1]/div")
    WebElement fleeceDescription;
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div")
    WebElement fleecePrice;
    @FindBy(css = "#add-to-cart-sauce-labs-fleece-jacket")
    WebElement fleeceButton;
    @FindBy(css = "#remove-sauce-labs-fleece-jacket")
    WebElement removeFleeceButton;

    //ONESIE
    @FindBy(css = "#item_2_img_link")
    WebElement onesieImage;
    @FindBy(css = "#item_2_title_link")
    WebElement onesieTitle;
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[1]/div")
    WebElement onesieDescription;
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[2]/div")
    WebElement onesiePrice;
    @FindBy(css = "#add-to-cart-sauce-labs-onesie")
    WebElement onesieButton;
    @FindBy(css = "#remove-sauce-labs-onesie")
    WebElement removeOnesieButton;

    //SWEATER
    @FindBy(css = "#item_3_img_link")
    WebElement sweaterImage;
    @FindBy(css = "#item_3_title_link")
    WebElement sweaterTitle;
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[1]/div")
    WebElement sweaterDescription;
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div")
    WebElement sweaterPrice;
    @FindBy(xpath = "//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
    WebElement sweaterButton;
    @FindBy(xpath = "//*[@id=\"remove-test.allthethings()-t-shirt-(red)\"]")
    WebElement removeSweaterButton;

    //FOOTER
    @FindBy(css = ".social_twitter")
    WebElement twitterButton;
    @FindBy(css = ".social_facebook")
    WebElement facebookButton;
    @FindBy(css = ".social_linkedin")
    WebElement linkedinButton;
    @FindBy(css = ".footer_copy")
    WebElement footerCopy;
}
