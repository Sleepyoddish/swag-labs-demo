package com.automation.pages;

import com.automation.support.SwagLabsEnum;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class CartPage extends BasePage {

    //SHOPPING CART
    @FindBy(css = ".shopping_cart_link")
    WebElement shoppingCartLink;
    @FindBy(css = ".shopping_cart_badge")
    WebElement shoppingCartBadge;

    //CART PRODUCTS
    @FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]")
    WebElement backpack;

    @FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[4]")
    WebElement shirt;

    @FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[5]")
    WebElement bikeLight;

    @FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[6]")
    WebElement fleece;
    @FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[7]")
    WebElement onesie;

    @FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[1]/div[8]")
    WebElement sweater;

    //FINAL CART PRODUCTS
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]")
    WebElement backpackFinal;
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[1]/div[4]")
    WebElement bikelightFinal;
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[1]/div[5]")
    WebElement shirtFinal;
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[1]/div[6]")
    WebElement fleeceFinal;
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[1]/div[7]")
    WebElement sweaterFinal;
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[1]/div[8]")
    WebElement onesieFinal;


    //BUTTONS
    @FindBy(css = "#continue-shopping")
    WebElement continueShoppingButton;
    @FindBy(css = "#checkout")
    WebElement checkoutButton;
    @FindBy(css = "#continue")
    WebElement continueButton;
    @FindBy(css = "#cancel")
    WebElement cancelButton;
    @FindBy(css = "#finish")
    WebElement finishButton;

    //SHIPPING INFO
    @FindBy(css = "#first-name")
    WebElement firstName;
    @FindBy(css = "#last-name")
    WebElement lastName;
    @FindBy(css = "#postal-code")
    WebElement postalCode;

    //FINALIZE CART
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[1]")
    WebElement paymentInformationTitle;
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[2]")
    WebElement paymentInformationValue;
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[3]")
    WebElement shippingInformationTitle;
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[4]")
    WebElement shippingInformationValue;
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[5]")
    WebElement priceTotal;
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]")
    WebElement itemTotal;
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]")
    WebElement taxTotal;
    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")
    WebElement finalTotal;

    //SUBMITTED PAGE
    @FindBy(css = ".title")
    WebElement title;
    @FindBy(css = ".pony_express")
    WebElement ponyExpressImage;
    @FindBy(css = ".complete-header")
    WebElement completeHeader;
    @FindBy(css = ".complete-text")
    WebElement completeText;
    @FindBy(css = "#back-to-products")
    WebElement backHomeButton;

    public void verifyFullCart() {
        shoppingCartLink.click();
        Assert.assertTrue(backpack.isDisplayed());
        Assert.assertTrue(shirt.isDisplayed());
        Assert.assertTrue(bikeLight.isDisplayed());
        Assert.assertTrue(fleece.isDisplayed());
        Assert.assertTrue(onesie.isDisplayed());
        Assert.assertTrue(sweater.isDisplayed());
        String shoppingCartBadge6 = shoppingCartBadge.getText();
        Assert.assertEquals(shoppingCartBadge6, "6");
    }

    public void verifyCheckOut() {
        continueShoppingButton.click();
        String landingPageURL = driver.getCurrentUrl();
        Assert.assertEquals(landingPageURL, "https://www.saucedemo.com/inventory.html");
        shoppingCartLink.click();
        checkoutButton.click();
        firstName.sendKeys("John");
        lastName.sendKeys("Smith");
        postalCode.sendKeys("41005");
        continueButton.click();
        Assert.assertTrue(backpackFinal.isDisplayed());
        Assert.assertTrue(shirtFinal.isDisplayed());
        Assert.assertTrue(bikelightFinal.isDisplayed());
        Assert.assertTrue(fleeceFinal.isDisplayed());
        Assert.assertTrue(onesieFinal.isDisplayed());
        Assert.assertTrue(sweaterFinal.isDisplayed());
        String shoppingCartBadge6 = shoppingCartBadge.getText();
        Assert.assertEquals(shoppingCartBadge6, "6");
        Assert.assertTrue(paymentInformationTitle.isDisplayed());
        String paymentInfoTitle = paymentInformationTitle.getText();
        Assert.assertEquals(paymentInfoTitle, SwagLabsEnum.PAYMENT_INFORMATION.getName());
        Assert.assertTrue(paymentInformationValue.isDisplayed());
        String paymentInfoValue = paymentInformationValue.getText();
        Assert.assertEquals(paymentInfoValue, SwagLabsEnum.PAYMENT_VALUE.getName());
        Assert.assertTrue(shippingInformationTitle.isDisplayed());
        String shippingInfoTitle = shippingInformationTitle.getText();
        Assert.assertEquals(shippingInfoTitle, SwagLabsEnum.SHIPPING_INFORMATION.getName());
        Assert.assertTrue(shippingInformationValue.isDisplayed());
        String shippingInfoValue = shippingInformationValue.getText();
        Assert.assertEquals(shippingInfoValue, SwagLabsEnum.SHIPPING_VALUE.getName());
    }

//    public void verifyItemTotal() {
//        double backpackCost = 29.99;
//        double shirtCost = 15.99;
//        double bikeLightCost = 9.99;
//        double fleeceCost = 49.99;
//        double onesieCost = 7.99;
//        double sweaterCost = 15.99;
//        double total = 0;
//    
//        if(Assert.assertTrue(backpackFinal.isDisplayed());){
//            total = total + backpackCost;
//        }
//        if(Assert.assertTrue(shirtFinal.isDisplayed());){
//            total = total + shirtCost;
//        }
//        if(Assert.assertTrue(bikelightFinal.isDisplayed());){
//            total = total + bikeLightCost;
//        }
//        if (Assert.assertTrue(fleeceFinal.isDisplayed());){
//            total = total + fleeceCost;
//        }
//        
//
//        String totalString = Double.toString(total);
//        String itemTotaled = itemTotal.getText();
//        Assert.assertTrue(itemTotaled.contains(totalString));
//    }

    public void submittedPage() {
        finishButton.click();
        Assert.assertTrue(title.isDisplayed());
        String submittedTitle = title.getText();
        Assert.assertEquals(submittedTitle, SwagLabsEnum.SUBMITTED_TITLE.getName());
        Assert.assertTrue(ponyExpressImage.isDisplayed());
        Assert.assertTrue(completeHeader.isDisplayed());
        String complete = completeHeader.getText();
        Assert.assertEquals(complete, SwagLabsEnum.THANK_YOU.getName());
        Assert.assertTrue(completeText.isDisplayed());
        String completedText = completeText.getText();
        Assert.assertEquals(completedText, SwagLabsEnum.ORDER_TEXT.getName());
        backHomeButton.click();
        String homePageURL = driver.getCurrentUrl();
        Assert.assertEquals(homePageURL, SwagLabsEnum.ALL_ITEMS_URL.getName());
    }
}
