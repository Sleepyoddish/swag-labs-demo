package com.automation.pages;

import com.automation.support.CartSubmitEnum;
import com.automation.support.LandingEnum;
import dev.slifer.sizzlecss.BySizzle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class CartPage extends BasePage {
    public void verifyFullCart() {
        driver.navigate().refresh();
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#item_4_title_link")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("#item_1_title_link")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("#item_0_title_link")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("#item_5_title_link")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("#item_2_title_link")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("#item_3_title_link")).isDisplayed());
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
        Assert.assertTrue(driver.findElement(By.cssSelector("#item_4_title_link")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("#item_0_title_link")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("#item_1_title_link")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("#item_5_title_link")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("#item_2_title_link")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("#item_3_title_link")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.cssSelector(".shopping_cart_badge")).getText(), "6");
        WebElement paymentInformationTitle = driver.findElement(BySizzle.css(".summary_info_label:contains('Payment Information')"));
        Assert.assertTrue(paymentInformationTitle.isDisplayed());
        Assert.assertEquals(paymentInformationTitle.getText(), CartSubmitEnum.PAYMENT_INFORMATION.getName());
        WebElement paymentInformationValue = driver.findElement(BySizzle.css(".summary_value_label:contains('SauceCard')"));
        Assert.assertTrue(paymentInformationValue.isDisplayed());
        Assert.assertEquals(paymentInformationValue.getText(), CartSubmitEnum.PAYMENT_VALUE.getName());
        WebElement shippingInformationTitle = driver.findElement(BySizzle.css(".summary_info_label:contains('Shipping Information')"));
        Assert.assertTrue(shippingInformationTitle.isDisplayed());
        Assert.assertEquals(shippingInformationTitle.getText(), CartSubmitEnum.SHIPPING_INFORMATION.getName());
        WebElement shippingInformationValue = driver.findElement(BySizzle.css(".summary_value_label:contains('Pony Express')"));
        Assert.assertTrue(shippingInformationValue.isDisplayed());
        Assert.assertEquals(shippingInformationValue.getText(), CartSubmitEnum.SHIPPING_VALUE.getName());
        WebElement priceTotal = driver.findElement(BySizzle.css(".summary_info_label:contains('Price Total')"));
        Assert.assertTrue(priceTotal.isDisplayed());
        Assert.assertEquals(priceTotal.getText(), CartSubmitEnum.PRICE_TOTAL.getName());
        WebElement itemTotal = driver.findElement(By.cssSelector(".summary_subtotal_label"));
        Assert.assertTrue(itemTotal.isDisplayed());
        Assert.assertEquals(itemTotal.getText(), CartSubmitEnum.ITEM_TOTAL_VALUE.getName());
        WebElement taxTotal = driver.findElement(By.cssSelector(".summary_tax_label"));
        Assert.assertTrue(taxTotal.isDisplayed());
        Assert.assertEquals(taxTotal.getText(), CartSubmitEnum.TAX_TOTAL_VALUE.getName());
        WebElement subtotal = driver.findElement(By.cssSelector(".summary_total_label"));
        Assert.assertTrue(subtotal.isDisplayed());
        Assert.assertEquals(subtotal.getText(), CartSubmitEnum.TOTAL_VALUE.getName());
    }

    public void verifyItemTotal() {
        double itemTotal = 129.94;
        double taxTotal = 10.40;
        double total = itemTotal + taxTotal;
        double expectedTotal = 140.34;

        if (total == expectedTotal) {
            System.out.println("total is correct: " + total);
        } else {
            System.out.println("total is incorrect: " + total);
        }

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
