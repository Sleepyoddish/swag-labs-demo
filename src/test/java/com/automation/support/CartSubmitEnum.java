package com.automation.support;

public enum CartSubmitEnum {

    //CART AND CHECKOUT
    PAYMENT_INFORMATION("Payment Information:"),
    PAYMENT_VALUE("SauceCard #31337"),
    SHIPPING_INFORMATION("Shipping Information:"),
    SHIPPING_VALUE("Free Pony Express Delivery!"),
    PRICE_TOTAL("Price Total"),
    ITEM_TOTAL_VALUE("Item total: $129.94"),
    TAX_TOTAL_VALUE("Tax: $10.40"),
    TOTAL_VALUE("Total: $140.34"),

    //SUBMITTED PAGE
    SUBMITTED_TITLE("Checkout: Complete!"),
    THANK_YOU("Thank you for your order!"),
    ORDER_TEXT("Your order has been dispatched, and will arrive just as fast as the pony can get there!");

    private String name;

    CartSubmitEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
