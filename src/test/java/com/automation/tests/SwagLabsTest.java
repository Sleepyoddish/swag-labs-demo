package com.automation.tests;

import com.automation.support.ProductEnum;
import dev.slifer.sizzlecss.BySizzle;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SwagLabsTest extends BaseTest {


    @Test(priority = 1)
    public void LoginWithLockedOutUser() {
        loginPage.checkPageTitleText();
        loginPage.verifyLoginCredentials();
        loginPage.loginLockedOutUser();
    }

    @Test(priority = 2)
    public void loginWithStandardUser() {
        loginPage.checkPageTitleText();
        loginPage.verifyLoginCredentials();
        loginPage.loginStandardUser();
    }

    @Test(priority = 3)
    public void landingPage() {
        landingPage.verifyTitles();
        landingPage.verifyHamburgerMenu();
    }

    @Test(priority = 4)
    public void footer() {
        landingPage.verifyFooter();
    }

    @Test(priority = 5, dataProvider = "products")
    public void productPage(By addLink, ProductEnum item, By removeLink, By image, By title, By desc, By price) {
        landingPage.verifyProducts(addLink, item, removeLink, image, title, desc, price);
    }

    @DataProvider(name = "products")
    public Object[][] createProducts() {
        return new Object[][]{
                {By.cssSelector("#add-to-cart-sauce-labs-backpack"), ProductEnum.BACKPACK, By.cssSelector("#remove-sauce-labs-backpack"), By.cssSelector(".inventory_item_img > #item_4_img_link"), By.cssSelector("#item_4_title_link"), BySizzle.css(".inventory_item_desc:contains('Sly Pack')"), BySizzle.css(".inventory_item_price:contains('29.99')")},
                {By.cssSelector("#add-to-cart-sauce-labs-bike-light"), ProductEnum.BIKE, By.cssSelector("#remove-sauce-labs-bike-light"), By.cssSelector(".inventory_item_img > #item_0_img_link"), By.cssSelector("#item_0_title_link"), BySizzle.css(".inventory_item_desc:contains('red light')"), BySizzle.css(".inventory_item_price:eq(1)")},
                {By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt"), ProductEnum.SHIRT, By.cssSelector("#remove-sauce-labs-bolt-t-shirt"), By.cssSelector(".inventory_item_img > #item_1_img_link"), By.cssSelector("#item_1_title_link"), BySizzle.css(".inventory_item_desc:contains('bolt T-shirt')"), BySizzle.css(".inventory_item_price:contains('15.99')")},
                {By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket"), ProductEnum.FLEECE, By.cssSelector("#remove-sauce-labs-fleece-jacket"), By.cssSelector(".inventory_item_img > #item_5_img_link"), By.cssSelector("#item_5_title_link"), BySizzle.css(".inventory_item_desc:contains('fleece jacket')"), BySizzle.css(".inventory_item_price:contains('49.99')")},
                {By.cssSelector("#add-to-cart-sauce-labs-onesie"), ProductEnum.ONESIE, By.cssSelector("#remove-sauce-labs-onesie"), By.cssSelector(".inventory_item_img > #item_2_img_link"), By.cssSelector("#item_2_title_link"), BySizzle.css(".inventory_item_desc:contains('infant onesie')"), BySizzle.css(".inventory_item_price:contains('7.99')")},
                {By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]"), ProductEnum.SWEATER, By.xpath("//*[@id=\"remove-test.allthethings()-t-shirt-(red)\"]"), By.cssSelector(".inventory_item_img > #item_3_img_link"), By.cssSelector("#item_3_title_link"), BySizzle.css(".inventory_item_desc:contains('Super-soft')"), BySizzle.css(".inventory_item_price:eq(5)")}
        };
    }

    @Test(priority = 6, dataProvider = "individualProducts")
    public void individualProductPage(By link, ProductEnum product) {
        productPage.verifyProductPage(link, product);
    }

    @DataProvider(name = "individualProducts")
    public Object[][] createIndividualProducts() {
        return new Object[][]{
                {By.id("item_4_img_link"), ProductEnum.BACKPACK},
                {By.id("item_0_img_link"), ProductEnum.BIKE},
                {By.id("item_1_img_link"), ProductEnum.SHIRT},
                {By.id("item_5_img_link"), ProductEnum.FLEECE},
                {By.id("item_2_img_link"), ProductEnum.ONESIE},
                {By.id("item_3_img_link"), ProductEnum.SWEATER}
        };
    }

    @Test(priority = 7)
    public void addItems() {
        landingPage.verifyAddItems();
    }


    @Test(priority = 8)
    public void cartPage() {
        cartPage.verifyFullCart();
        cartPage.verifyCheckOut();
        cartPage.verifyItemTotal();
        cartPage.submittedPage();
        landingPage.logout();
    }


}
