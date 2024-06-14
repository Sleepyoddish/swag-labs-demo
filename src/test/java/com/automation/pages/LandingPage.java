package com.automation.pages;

import com.automation.support.LandingEnum;
import com.automation.support.ProductEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.collections.Lists;

import java.util.List;

public class LandingPage extends BasePage {


    public void verifyTitles() {
        Assert.assertEquals(driver.findElement(By.cssSelector(".app_logo")).getText(), LandingEnum.APP_LOGO.getName());
        Assert.assertEquals(driver.findElement(By.cssSelector(".title")).getText(), LandingEnum.PAGE_TITLE.getName());
    }

    public void verifyHamburgerMenu() {
        driver.findElement(By.cssSelector("#react-burger-menu-btn")).click();
        WebElement allItemsButton = driver.findElement(By.cssSelector("#inventory_sidebar_link"));
        wait.until(ExpectedConditions.visibilityOf(allItemsButton));
        Assert.assertEquals(allItemsButton.getText(), LandingEnum.ALL_ITEMS_BUTTON.getName());
        allItemsButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), LandingEnum.ALL_ITEMS_URL.getName());
        driver.navigate().back();
        WebElement aboutButton = driver.findElement(By.cssSelector("#about_sidebar_link"));
        Assert.assertEquals(aboutButton.getText(), LandingEnum.ABOUT_BUTTON.getName());
        aboutButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), LandingEnum.ABOUT_BUTTON_URL.getName());
        driver.navigate().back();
    }


    public void verifyProducts(By addLink, ProductEnum item, By removeLink, By image, By title, By desc, By price) {
        WebElement actionButton = driver.findElement(addLink);
        actionButton.click();
        WebElement shoppingCartBadge = driver.findElement(By.cssSelector(".shopping_cart_badge"));
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge.getText(), "1");
        actionButton = driver.findElement(removeLink);
        wait.until(ExpectedConditions.visibilityOf(actionButton));
        Assert.assertTrue(actionButton.isDisplayed());
        actionButton.click();
        wait.until(ExpectedConditions.invisibilityOf(shoppingCartBadge));
        Assert.assertTrue((driver.findElement(image).isDisplayed()));
        driver.navigate().refresh();
        actionButton = driver.findElement(addLink);
        wait.until(ExpectedConditions.visibilityOf(actionButton));
        Assert.assertTrue(actionButton.isDisplayed());
        Assert.assertEquals(driver.findElement(title).getText(), item.getTitle());
        Assert.assertEquals(driver.findElement(desc).getText(), item.getDescription());
        Assert.assertEquals(driver.findElement(price).getText(), item.getPrice());
    }

    public void verifyAddItems() {
        WebElement backpackButton = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
        wait.until(ExpectedConditions.elementToBeClickable(backpackButton));
        backpackButton.click();
        WebElement shoppingCartBadge = driver.findElement(By.cssSelector(".shopping_cart_badge"));
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge.getText(), "1");
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light")).click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge.getText(), "2");
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt")).click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge.getText(), "3");
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket")).click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge.getText(), "4");
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-onesie")).click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge.getText(), "5");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
        Assert.assertTrue(shoppingCartBadge.isDisplayed());
        Assert.assertEquals(shoppingCartBadge.getText(), "6");
    }


    public void verifyFooter() {
        driver.findElement(By.cssSelector(".social_twitter")).click();
        List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        wait.until(ExpectedConditions.urlToBe(LandingEnum.TWITTER_URL.getName()));
        Assert.assertEquals(driver.getCurrentUrl(), LandingEnum.TWITTER_URL.getName());
        driver.close();
        driver.switchTo().window(browserTabs.get(0));
        driver.findElement(By.cssSelector(".social_facebook")).click();
        browserTabs = Lists.newArrayList(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), LandingEnum.FACEBOOK_URL.getName());
        driver.close();
//        driver.switchTo().window(browserTabs.get(0));
//        driver.findElement(By.cssSelector(".social_linkedin")).click();
//        browserTabs = Lists.newArrayList(driver.getWindowHandles());
//        driver.switchTo().window(browserTabs.get(1));
//        Assert.assertEquals(driver.getCurrentUrl(), LandingEnum.LINKEDIN_URL.getName());
//        driver.close();
        driver.switchTo().window(browserTabs.get(0));
        Assert.assertEquals(driver.findElement(By.cssSelector(".footer_copy")).getText(), LandingEnum.FOOTER_COPY.getName());
    }

    public void logout() {
        driver.findElement(By.cssSelector("#react-burger-menu-btn")).click();
        driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
    }


}
