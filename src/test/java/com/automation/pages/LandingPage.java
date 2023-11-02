package com.automation.pages;

import com.automation.support.SwagLabsEnum;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LandingPage extends BasePage {

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


    public void verifyTitles() {
        String logo = appLogo.getText();
        Assert.assertEquals(logo, SwagLabsEnum.APP_LOGO.getName());
        Assert.assertTrue(pageTitle.isDisplayed());
        String title = pageTitle.getText();
        Assert.assertEquals(title, SwagLabsEnum.PAGE_TITLE.getName());

    }

    public void verifyHamburgerMenu() {
        hamburgerMenuButton.click();
        wait.until(ExpectedConditions.visibilityOf(allItemsButton));
        String allItemsButtonText = allItemsButton.getText();
        Assert.assertEquals(allItemsButtonText, SwagLabsEnum.ALL_ITEMS_BUTTON.getName());
        allItemsButton.click();
        String allItemsURL = driver.getCurrentUrl();
        Assert.assertEquals(allItemsURL, SwagLabsEnum.ALL_ITEMS_URL.getName());
        driver.navigate().back();
        String aboutButtonText = aboutButton.getText();
        Assert.assertEquals(aboutButtonText, SwagLabsEnum.ABOUT_BUTTON.getName());
        aboutButton.click();
        String aboutButton = driver.getCurrentUrl();
        Assert.assertEquals(aboutButton, SwagLabsEnum.ABOUT_BUTTON_URL.getName());
        driver.navigate().back();
    }

    public void verifyBackpack() {
        backpackImage.click();
        String backpackURL = driver.getCurrentUrl();
        Assert.assertEquals(backpackURL, SwagLabsEnum.BACKPACK_URL.getName());
        backpackButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        String shoppingCartBadge1 = shoppingCartBadge.getText();
        Assert.assertEquals(shoppingCartBadge1, "1");
        removeBackpackButton.click();
        wait.until(ExpectedConditions.invisibilityOf(shoppingCartBadge));
        Assert.assertTrue(backpackButton.isDisplayed());
        driver.navigate().back();
        String backpack = backpackTitle.getText();
        Assert.assertEquals(backpack, SwagLabsEnum.BACKPACK_TITLE.getName());
        backpackTitle.click();
        Assert.assertEquals(backpackURL, SwagLabsEnum.BACKPACK_URL.getName());
        driver.navigate().back();
        Assert.assertTrue(backpackDescription.isDisplayed());
        String backpackDesc = backpackDescription.getText();
        Assert.assertEquals(backpackDesc, SwagLabsEnum.BACKPACK_DESCRIPTION.getName());
        Assert.assertTrue(backpackPrice.isDisplayed());
        String backpackCost = backpackPrice.getText();
        Assert.assertEquals(backpackCost, SwagLabsEnum.BACKPACK_PRICE.getName());
        backpackButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge1, "1");
        removeBackpackButton.click();
        wait.until(ExpectedConditions.invisibilityOf(shoppingCartBadge));
        Assert.assertTrue(backpackButton.isDisplayed());
    }

    public void verifyBikeLight() {
        bikeImage.click();
        String bikeURL = driver.getCurrentUrl();
        Assert.assertEquals(bikeURL, SwagLabsEnum.BIKE_URL.getName());
        bikeButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        String shoppingCartBadge1 = shoppingCartBadge.getText();
        Assert.assertEquals(shoppingCartBadge1, "1");
        removeBikeButton.click();
        wait.until(ExpectedConditions.invisibilityOf(shoppingCartBadge));
        Assert.assertTrue(bikeButton.isDisplayed());
        driver.navigate().back();
        String bike = bikeTitle.getText();
        Assert.assertEquals(bike, SwagLabsEnum.BIKE_TITLE.getName());
        bikeTitle.click();
        Assert.assertEquals(bikeURL, SwagLabsEnum.BIKE_URL.getName());
        driver.navigate().back();
        Assert.assertTrue(bikeDescription.isDisplayed());
        String bikeLightDesc = bikeDescription.getText();
        Assert.assertEquals(bikeLightDesc, SwagLabsEnum.BIKE_DESCRIPTION.getName());
        Assert.assertTrue(bikePrice.isDisplayed());
        String bikeLightPrice = bikePrice.getText();
        Assert.assertEquals(bikeLightPrice, SwagLabsEnum.BIKE_PRICE.getName());
        bikeButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge1, "1");
        removeBikeButton.click();
        wait.until(ExpectedConditions.invisibilityOf(shoppingCartBadge));
        Assert.assertTrue(bikeButton.isDisplayed());
    }

    public void verifyTShirt() {
        shirtImage.click();
        String shirtURL = driver.getCurrentUrl();
        Assert.assertEquals(shirtURL, SwagLabsEnum.SHIRT_URL.getName());
        shirtButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        String shoppingCartBadge1 = shoppingCartBadge.getText();
        Assert.assertEquals(shoppingCartBadge1, "1");
        removeShirtButton.click();
        wait.until(ExpectedConditions.invisibilityOf(shoppingCartBadge));
        Assert.assertTrue(shirtButton.isDisplayed());
        driver.navigate().back();
        String shirt = shirtTitle.getText();
        Assert.assertEquals(shirt, SwagLabsEnum.SHIRT_TITLE.getName());
        shirtTitle.click();
        Assert.assertEquals(shirtURL, SwagLabsEnum.SHIRT_URL.getName());
        driver.navigate().back();
        Assert.assertTrue(shirtDescription.isDisplayed());
        String shirtDesc = shirtDescription.getText();
        Assert.assertEquals(shirtDesc, SwagLabsEnum.SHIRT_DESCRIPTION.getName());
        Assert.assertTrue(shirtPrice.isDisplayed());
        String shirtCost = shirtPrice.getText();
        Assert.assertEquals(shirtCost, SwagLabsEnum.SHIRT_PRICE.getName());
        shirtButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge1, "1");
        removeShirtButton.click();
        wait.until(ExpectedConditions.invisibilityOf(shoppingCartBadge));
        Assert.assertTrue(shirtButton.isDisplayed());
    }

    public void verifyFleece() {
        fleeceImage.click();
        String fleeceURL = driver.getCurrentUrl();
        Assert.assertEquals(fleeceURL, SwagLabsEnum.FLEECE_URL.getName());
        fleeceButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        String shoppingCartBadge1 = shoppingCartBadge.getText();
        Assert.assertEquals(shoppingCartBadge1, "1");
        removeFleeceButton.click();
        wait.until(ExpectedConditions.invisibilityOf(shoppingCartBadge));
        Assert.assertTrue(fleeceButton.isDisplayed());
        driver.navigate().back();
        String fleece = fleeceTitle.getText();
        Assert.assertEquals(fleece, SwagLabsEnum.FLEECE_TITLE.getName());
        fleeceTitle.click();
        Assert.assertEquals(fleeceURL, SwagLabsEnum.FLEECE_URL.getName());
        driver.navigate().back();
        Assert.assertTrue(fleeceDescription.isDisplayed());
        String fleeceDesc = fleeceDescription.getText();
        Assert.assertEquals(fleeceDesc, SwagLabsEnum.FLEECE_DESCRIPTION.getName());
        Assert.assertTrue(fleecePrice.isDisplayed());
        String fleeceCost = fleecePrice.getText();
        Assert.assertEquals(fleeceCost, SwagLabsEnum.FLEECE_PRICE.getName());
        fleeceButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge1, "1");
        removeFleeceButton.click();
        wait.until(ExpectedConditions.invisibilityOf(shoppingCartBadge));
        Assert.assertTrue(fleeceButton.isDisplayed());
    }

    public void verifyOnesie() {
        onesieImage.click();
        String onesieURL = driver.getCurrentUrl();
        Assert.assertEquals(onesieURL, SwagLabsEnum.ONESIE_URL.getName());
        onesieButton.click();
        String shoppingCartBadge1 = shoppingCartBadge.getText();
        Assert.assertEquals(shoppingCartBadge1, "1");
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        removeOnesieButton.click();
        wait.until(ExpectedConditions.invisibilityOf(shoppingCartBadge));
        Assert.assertTrue(onesieButton.isDisplayed());
        driver.navigate().back();
        String onesie = onesieTitle.getText();
        Assert.assertEquals(onesie, SwagLabsEnum.ONESIE_TITLE.getName());
        onesieTitle.click();
        Assert.assertEquals(onesieURL, SwagLabsEnum.ONESIE_URL.getName());
        driver.navigate().back();
        Assert.assertTrue(onesieDescription.isDisplayed());
        String onesieDesc = onesieDescription.getText();
        Assert.assertEquals(onesieDesc, SwagLabsEnum.ONESIE_DESCRIPTION.getName());
        Assert.assertTrue(onesiePrice.isDisplayed());
        String onesieCost = onesiePrice.getText();
        Assert.assertEquals(onesieCost, SwagLabsEnum.ONESIE_PRICE.getName());
        onesieButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge1, "1");
        removeOnesieButton.click();
        wait.until(ExpectedConditions.invisibilityOf(shoppingCartBadge));
        Assert.assertTrue(onesieButton.isDisplayed());
    }

    public void verifySweater() {
        sweaterImage.click();
        String sweaterURL = driver.getCurrentUrl();
        Assert.assertEquals(sweaterURL, SwagLabsEnum.SWEATER_URL.getName());
        sweaterButton.click();
        String shoppingCartBadge1 = shoppingCartBadge.getText();
        Assert.assertEquals(shoppingCartBadge1, "1");
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        removeSweaterButton.click();
        wait.until(ExpectedConditions.invisibilityOf(shoppingCartBadge));
        Assert.assertTrue(sweaterButton.isDisplayed());
        driver.navigate().back();
        String sweater = sweaterTitle.getText();
        Assert.assertEquals(sweater, SwagLabsEnum.SWEATER_TITLE.getName());
        sweaterTitle.click();
        Assert.assertEquals(sweaterURL, SwagLabsEnum.SWEATER_URL.getName());
        driver.navigate().back();
        Assert.assertTrue(sweaterDescription.isDisplayed());
        String sweaterDesc = sweaterDescription.getText();
        Assert.assertEquals(sweaterDesc, SwagLabsEnum.SWEATER_DESCRIPTION.getName());
        Assert.assertTrue(sweaterPrice.isDisplayed());
        String sweaterCost = sweaterPrice.getText();
        Assert.assertEquals(sweaterCost, SwagLabsEnum.SWEATER_PRICE.getName());
        sweaterButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge1, "1");
        removeSweaterButton.click();
        wait.until(ExpectedConditions.invisibilityOf(shoppingCartBadge));
        Assert.assertTrue(sweaterButton.isDisplayed());
    }

    public void verifyAddItems() {
        backpackButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        String shoppingCartBadge1 = shoppingCartBadge.getText();
        Assert.assertEquals(shoppingCartBadge1, "1");
        bikeButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        String shoppingCartBadge2 = shoppingCartBadge.getText();
        Assert.assertEquals(shoppingCartBadge2, "2");
        shirtButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        String shoppingCartBadge3 = shoppingCartBadge.getText();
        Assert.assertEquals(shoppingCartBadge3, "3");
        fleeceButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        String shoppingCartBadge4 = shoppingCartBadge.getText();
        Assert.assertEquals(shoppingCartBadge4, "4");
        onesieButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        String shoppingCartBadge5 = shoppingCartBadge.getText();
        Assert.assertEquals(shoppingCartBadge5, "5");
        sweaterButton.click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        String shoppingCartBadge6 = shoppingCartBadge.getText();
        Assert.assertEquals(shoppingCartBadge6, "6");
    }


    public void verifyFooter() {
//        twitterButton.click();
//        String twitterURL = driver.getCurrentUrl();
//        Assert.assertEquals(twitterURL, SwagLabsEnum.TWITTER_URL.getName());
//        driver.navigate().back();
//        facebookButton.click();
//        String facebookURL = driver.getCurrentUrl();
//        Assert.assertEquals(facebookURL, SwagLabsEnum.FACEBOOK_URL.getName());
//        driver.navigate().back();
//        linkedinButton.click();
//        String linkedinURL = driver.getCurrentUrl();
//        Assert.assertEquals(linkedinURL, SwagLabsEnum.LINKEDIN_URL.getName());
//        driver.navigate().back();
        String footer = footerCopy.getText();
        Assert.assertEquals(footer, SwagLabsEnum.FOOTER_COPY.getName());
    }

    public void logout() {
        hamburgerMenuButton.click();
        logoutButton.click();
    }


}
