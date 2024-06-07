package com.automation.pages;

import com.automation.support.CartSubmitEnum;
import com.automation.support.LandingEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.text.DecimalFormat;


public class CartPage extends BasePage {
    public void verifyFullCart() {
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        WebElement backpack = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]"));
        Assert.assertTrue(backpack.isDisplayed());
        WebElement shirt = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[4]"));
        Assert.assertTrue(shirt.isDisplayed());
        WebElement bikeLight = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[5]"));
        Assert.assertTrue(bikeLight.isDisplayed());
        WebElement fleece = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[6]"));
        Assert.assertTrue(fleece.isDisplayed());
        WebElement onesie = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[7]"));
        Assert.assertTrue(onesie.isDisplayed());
        WebElement sweater = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[8]"));
        Assert.assertTrue(sweater.isDisplayed());
        Assert.assertEquals(driver.findElement(By.cssSelector(".shopping_cart_badge")).getText(), "6");
    }

    public void verifyCheckOut() {
        driver.findElement(By.cssSelector("#continue-shopping")).click();
        Assert.assertEquals(driver.getCurrentUrl(), LandingEnum.ALL_ITEMS_URL.getName());
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        driver.findElement(By.cssSelector("#checkout")).click();
        driver.findElement(By.cssSelector("#first-name")).sendKeys("John");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("Smith");
        driver.findElement(By.cssSelector("#postal-code")).sendKeys("41005");
        driver.findElement(By.cssSelector("#continue")).click();
        WebElement backpackFinal = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]"));
        Assert.assertTrue(backpackFinal.isDisplayed());
        WebElement shirtFinal = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[5]"));
        Assert.assertTrue(shirtFinal.isDisplayed());
        WebElement bikelightFinal = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[4]"));
        Assert.assertTrue(bikelightFinal.isDisplayed());
        WebElement fleeceFinal = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[6]"));
        Assert.assertTrue(fleeceFinal.isDisplayed());
        WebElement onesieFinal = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[8]"));
        Assert.assertTrue(onesieFinal.isDisplayed());
        WebElement sweaterFinal = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[7]"));
        Assert.assertTrue(sweaterFinal.isDisplayed());
        Assert.assertEquals(driver.findElement(By.cssSelector(".shopping_cart_badge")).getText(), "6");
        WebElement paymentInformationTitle = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[1]"));
        Assert.assertTrue(paymentInformationTitle.isDisplayed());
        Assert.assertEquals(paymentInformationTitle.getText(), CartSubmitEnum.PAYMENT_INFORMATION.getName());
        WebElement paymentInformationValue = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[2]"));
        Assert.assertTrue(paymentInformationValue.isDisplayed());
        Assert.assertEquals(paymentInformationValue.getText(), CartSubmitEnum.PAYMENT_VALUE.getName());
        WebElement shippingInformationTitle = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[3]"));
        Assert.assertTrue(shippingInformationTitle.isDisplayed());
        Assert.assertEquals(shippingInformationTitle.getText(), CartSubmitEnum.SHIPPING_INFORMATION.getName());
        WebElement shippingInformationValue = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[4]"));
        Assert.assertTrue(shippingInformationValue.isDisplayed());
        Assert.assertEquals(shippingInformationValue.getText(), CartSubmitEnum.SHIPPING_VALUE.getName());
        WebElement priceTotal = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[5]"));
        Assert.assertTrue(priceTotal.isDisplayed());
        Assert.assertEquals(priceTotal.getText(), CartSubmitEnum.PRICE_TOTAL.getName());


    }

    public void verifyItemTotal() {
        WebElement backpackFinal = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]"));
        WebElement shirtFinal = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[5]"));
        WebElement bikelightFinal = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[4]"));
        WebElement fleeceFinal = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[6]"));
        WebElement onesieFinal = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[8]"));
        WebElement sweaterFinal = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[7]"));

        double[] itemCosts = {29.99, 15.99, 9.99, 49.99, 7.99, 15.99};
        WebElement[] item = {backpackFinal, shirtFinal, bikelightFinal, fleeceFinal, onesieFinal, sweaterFinal};

        double total = 0;

        for (int i = 0; i < item.length; i++) {

            if (item[i].isDisplayed()) {
                total += itemCosts[i];
            }
        }

        String totalString = Double.toString(total);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[7]")).getText().contains(totalString));

        DecimalFormat df = new DecimalFormat("#.##");
        double tax = Double.parseDouble(df.format(total * .08));
        String taxString = Double.toString(tax);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]")).getText().contains(taxString));

        double totalPlusTax = total + tax;
        String totalPlusTaxString = Double.toString(totalPlusTax);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")).getText().contains(totalPlusTaxString));
    }

    public void submittedPage() {
        driver.findElement(By.cssSelector("#finish")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".title")).getText(), CartSubmitEnum.SUBMITTED_TITLE.getName());
        Assert.assertTrue(driver.findElement(By.cssSelector(".pony_express")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.cssSelector(".complete-header")).getText(), CartSubmitEnum.THANK_YOU.getName());
        Assert.assertEquals(driver.findElement(By.cssSelector(".complete-text")).getText(), CartSubmitEnum.ORDER_TEXT.getName());
        driver.findElement(By.cssSelector("#back-to-products")).click();
        Assert.assertEquals(driver.getCurrentUrl(), LandingEnum.ALL_ITEMS_URL.getName());
    }
}
