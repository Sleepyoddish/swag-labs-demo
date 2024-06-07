package com.automation.tests;

import com.automation.support.ProductEnum;
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

    @Test(priority = 4, dataProvider = "products")
    public void productPage(By addLink, ProductEnum item, By removeLink, By image, By title, By desc, By price) {
        landingPage.verifyProducts(addLink, item, removeLink, image, title, desc, price);
        landingPage.verifyAddItems();
    }

    @DataProvider(name = "products")
    public Object[][] createProducts() {
        return new Object[][]{
                {By.id("add-to-cart-sauce-labs-backpack"), ProductEnum.BACKPACK, By.id("remove-sauce-labs-backpack"), By.id("item_4_img_link"), By.id("item_4_title_link"), By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[1]/div"), By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")},
                {By.id("add-to-cart-sauce-labs-bike-light"), ProductEnum.BIKE, By.id("remove-sauce-labs-bike-light"), By.id("item_0_img_link"), By.id("item_0_title_link"), By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[1]/div"), By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div")},
                {By.id("add-to-cart-sauce-labs-bolt-t-shirt"), ProductEnum.SHIRT, By.id("remove-sauce-labs-bolt-t-shirt"), By.id("item_1_img_link"), By.id("item_1_title_link"), By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[1]/div"), By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[2]/div[2]/div")},
                {By.id("add-to-cart-sauce-labs-fleece-jacket"), ProductEnum.FLEECE, By.id("remove-sauce-labs-fleece-jacket"), By.id("item_5_img_link"), By.id("item_5_title_link"), By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[1]/div"), By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div")},
                {By.id("add-to-cart-sauce-labs-onesie"), ProductEnum.ONESIE, By.id("remove-sauce-labs-onesie"), By.id("item_2_img_link"), By.id("item_2_title_link"), By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[1]/div"), By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[2]/div")},
                {By.id("add-to-cart-test.allthethings()-t-shirt-(red)"), ProductEnum.SWEATER, By.id("remove-sauce-labs-test.allthethings()-t-shirt-(red)"), By.id("#tem_3_img_link"), By.id("item_3_title_link"), By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[1]/div"), By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[2]/div[2]/div")}
        };
    }


    @Test(priority = 5, dataProvider = "individualProducts")
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

    @Test(priority = 6)
    public void footer() {
        landingPage.verifyFooter();
    }

    @Test(priority = 7)
    public void cartPage() {
        cartPage.verifyFullCart();
        cartPage.verifyCheckOut();
        cartPage.verifyItemTotal();
        cartPage.submittedPage();
        landingPage.logout();
    }


}
