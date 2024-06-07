package com.automation.pages;

import com.automation.support.CartSubmitEnum;
import com.automation.support.LandingEnum;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.text.DecimalFormat;


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
        Assert.assertEquals(shoppingCartBadge.getText(), "6");
    }

    public void verifyCheckOut() {
        continueShoppingButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), LandingEnum.ALL_ITEMS_URL.getName());
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
        Assert.assertEquals(shoppingCartBadge.getText(), "6");
        Assert.assertTrue(paymentInformationTitle.isDisplayed());
        Assert.assertEquals(paymentInformationTitle.getText(), CartSubmitEnum.PAYMENT_INFORMATION.getName());
        Assert.assertTrue(paymentInformationValue.isDisplayed());
        Assert.assertEquals(paymentInformationValue.getText(), CartSubmitEnum.PAYMENT_VALUE.getName());
        Assert.assertTrue(shippingInformationTitle.isDisplayed());
        Assert.assertEquals(shippingInformationTitle.getText(), CartSubmitEnum.SHIPPING_INFORMATION.getName());
        Assert.assertTrue(shippingInformationValue.isDisplayed());
        Assert.assertEquals(shippingInformationValue.getText(), CartSubmitEnum.SHIPPING_VALUE.getName());
        Assert.assertTrue(priceTotal.isDisplayed());
        Assert.assertEquals(priceTotal.getText(), CartSubmitEnum.PRICE_TOTAL.getName());


    }

    public void verifyItemTotal() {
        double[] itemCosts = {29.99, 15.99, 9.99, 49.99, 7.99, 15.99};
        WebElement[] item = {backpackFinal, shirtFinal, bikelightFinal, fleeceFinal, onesieFinal, sweaterFinal};

        double total = 0;

        for (int i = 0; i < item.length; i++) {

            if (item[i].isDisplayed()) {
                total += itemCosts[i];
            }
        }

        String totalString = Double.toString(total);
        Assert.assertTrue(itemTotal.getText().contains(totalString));

        DecimalFormat df = new DecimalFormat("#.##");
        double tax = Double.parseDouble(df.format(total * .08));
        String taxString = Double.toString(tax);
        Assert.assertTrue(taxTotal.getText().contains(taxString));

        double totalPlusTax = total + tax;
        String totalPlusTaxString = Double.toString(totalPlusTax);
        Assert.assertTrue(finalTotal.getText().contains(totalPlusTaxString));

    }

    public void submittedPage() {
        finishButton.click();
        Assert.assertTrue(title.isDisplayed());
        Assert.assertEquals(title.getText(), CartSubmitEnum.SUBMITTED_TITLE.getName());
        Assert.assertTrue(ponyExpressImage.isDisplayed());
        Assert.assertTrue(completeHeader.isDisplayed());
        Assert.assertEquals(completeHeader.getText(), CartSubmitEnum.THANK_YOU.getName());
        Assert.assertTrue(completeText.isDisplayed());
        Assert.assertEquals(completeText.getText(), CartSubmitEnum.ORDER_TEXT.getName());
        backHomeButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), LandingEnum.ALL_ITEMS_URL.getName());
    }
}
