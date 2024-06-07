package com.automation.pages;

import com.automation.support.LandingEnum;
import com.automation.support.ProductEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LandingPage extends BasePage {

    BasePage basePage = new BasePage();

    //LANDING PAGE
    @FindBy(css = ".app_logo")
    WebElement appLogo;
    @FindBy(css = ".title")
    WebElement pageTitle;


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

    //SORTING CONTAINER
    @FindBy(css = ".product_sort_container")
    WebElement sortContainer;

    @FindBy(xpath = "//*[@id=\"inventory_filter_container\"]/select/option[1]")
    WebElement aToZ;

    @FindBy(xpath = "//*[@id=\"inventory_filter_container\"]/select/option[2]")
    WebElement zToA;

    @FindBy(xpath = "//*[@id=\"inventory_filter_container\"]/select/option[3]")
    WebElement lowToHigh;

    @FindBy(xpath = "//*[@id=\"inventory_filter_container\"]/select/option[4]")
    WebElement highToLow;
    @FindBy(css = "#inventory_container")
    WebElement inventoryContainer;

    //BACKPACK
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[2]")
    WebElement backpackContainer;
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
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[2]")
    WebElement bikeContainer;
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
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[3]")
    WebElement shirtContainer;
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
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[4]")
    WebElement fleeceContainer;
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
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[5]")
    WebElement onesieContainer;
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
    @FindBy(xpath = "//*[@id=\"inventory_container\"]/div/div[6]")
    WebElement sweaterContainer;
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


    public void verifyTitles() {
        Assert.assertEquals(appLogo.getText(), LandingEnum.APP_LOGO.getName());
        Assert.assertEquals(pageTitle.getText(), LandingEnum.PAGE_TITLE.getName());

    }

    public void verifyHamburgerMenu() {
        hamburgerMenuButton.click();
        wait.until(ExpectedConditions.visibilityOf(allItemsButton));
        Assert.assertEquals(allItemsButton.getText(), LandingEnum.ALL_ITEMS_BUTTON.getName());
        allItemsButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), LandingEnum.ALL_ITEMS_URL.getName());
        driver.navigate().back();
        Assert.assertEquals(aboutButton.getText(), LandingEnum.ABOUT_BUTTON.getName());
        aboutButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), LandingEnum.ABOUT_BUTTON_URL.getName());
        driver.navigate().back();
    }

//    public void verifySorting() {
//        WebElement[] itemAsc = {backpackContainer, bikeContainer, shirtContainer, fleeceContainer, onesieContainer, sweaterContainer};
//        assertThat(inventoryContainer, equalTo(itemAsc));
//        sortContainer.click();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        zToA.click();
//        WebElement[] itemDesc = {sweaterContainer, onesieContainer, fleeceContainer, shirtContainer, bikeContainer, backpackContainer};
//        assertThat(inventoryContainer, equalTo(itemDesc));
//        sortContainer.click();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        lowToHigh.click();
//        WebElement[] priceLow = {onesieContainer, bikeContainer, shirtContainer, sweaterContainer, backpackContainer, fleeceContainer};
//        assertThat(inventoryContainer, equalTo(priceLow));
//        sortContainer.click();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        highToLow.click();
//        WebElement[] priceHigh = {fleeceContainer, backpackContainer, sweaterContainer, shirtContainer, bikeContainer, onesieContainer};
//        assertThat(inventoryContainer, equalTo(priceHigh));
//    }


    public void verifyProducts(By addLink, ProductEnum item, By removeLink, By image, By button, By title, By desc, By price) {
        WebElement itemLink = driver.findElement(addLink);
        WebElement removalLink = driver.findElement(removeLink);
        itemLink.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge.getText(), "1");
        removalLink.click();
        wait.until(ExpectedConditions.invisibilityOf(shoppingCartBadge));
        Assert.assertTrue((backpackImage.isDisplayed()));
        Assert.assertTrue(backpackButton.isDisplayed());
        Assert.assertEquals(backpackTitle.getText(), item.getTitle());
        Assert.assertEquals(backpackDescription.getText(), item.getDescription());
        Assert.assertEquals(backpackPrice.getText(), item.getPrice());
    }

    public void verifyAddItems() {
        backpackButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge.getText(), "1");
        bikeButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge.getText(), "2");
        shirtButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge.getText(), "3");
        fleeceButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge.getText(), "4");
        onesieButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge.getText(), "5");
        sweaterButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge.getText(), "6");
    }


    public void verifyFooter() {
        twitterButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), LandingEnum.TWITTER_URL.getName());
        driver.navigate().back();
        facebookButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), LandingEnum.FACEBOOK_URL.getName());
        driver.navigate().back();
        linkedinButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), LandingEnum.LINKEDIN_URL.getName());
        driver.navigate().back();
        Assert.assertEquals(footerCopy.getText(), LandingEnum.FOOTER_COPY.getName());
    }

    public void logout() {
        hamburgerMenuButton.click();
        logoutButton.click();
    }


}
