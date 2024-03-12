package com.automation.support;

public enum SwagLabsEnum {

    //LOGIN
    SWAGLABS_URL("https://www.saucedemo.com/"),
    LOGIN_HEADER("Swag Labs"),

    //LANDING PAGE
    APP_LOGO("Swag Labs"),
    PAGE_TITLE("Products"),

    //HAMBURGER MENU BUTTONS
    ALL_ITEMS_BUTTON("All Items"),
    ALL_ITEMS_URL("https://www.saucedemo.com/inventory.html"),
    ABOUT_BUTTON("About"),
    ABOUT_BUTTON_URL("https://saucelabs.com/"),
    LOGOUT_BUTTON("Logout"),
    LOGOUT_BUTTON_URL("https://www.saucedemo.com/"),
    RESET_BUTTON("Reset App State"),

    //BACKPACK
    BACKPACK_URL("https://www.saucedemo.com/inventory-item.html?id=4"),
    BACKPACK_TITLE("Sauce Labs Backpack"),
    BACKPACK_DESCRIPTION("carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection."),
    BACKPACK_PRICE("$29.99"),
    BACKPACK_BUTTON("Add to cart"),

    //BIKE LIGHT
    BIKE_URL("https://www.saucedemo.com/inventory-item.html?id=0"),
    BIKE_TITLE("Sauce Labs Bike Light"),
    BIKE_DESCRIPTION("A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included."),
    BIKE_PRICE("$9.99"),
    BIKE_BUTTON("Add to cart"),

    //SHIRT
    SHIRT_URL("https://www.saucedemo.com/inventory-item.html?id=1"),
    SHIRT_TITLE("Sauce Labs Bolt T-Shirt"),
    SHIRT_DESCRIPTION("Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt."),
    SHIRT_PRICE("$15.99"),
    SHIRT_BUTTON("Add to cart"),

    //FLEECE
    FLEECE_URL("https://www.saucedemo.com/inventory-item.html?id=5"),
    FLEECE_TITLE("Sauce Labs Fleece Jacket"),
    FLEECE_DESCRIPTION("It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office."),
    FLEECE_PRICE("$49.99"),
    FLEECE_BUTTON("Add to cart"),

    //ONESIE
    ONESIE_URL("https://www.saucedemo.com/inventory-item.html?id=2"),
    ONESIE_TITLE("Sauce Labs Onesie"),
    ONESIE_DESCRIPTION("Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel."),
    ONESIE_PRICE("$7.99"),
    ONESIE_BUTTON("Add to cart"),

    //SWEATER
    SWEATER_URL("https://www.saucedemo.com/inventory-item.html?id=3"),
    SWEATER_TITLE("Test.allTheThings() T-Shirt (Red)"),
    SWEATER_DESCRIPTION("This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton."),
    SWEATER_PRICE("$15.99"),
    SWEATER_BUTTON("Add to cart"),

    //FOOTER
    TWITTER_URL("https://twitter.com/saucelabs"),
    FACEBOOK_URL("https://www.facebook.com/saucelabs"),
    LINKEDIN_URL("https://www.linkedin.com/company/sauce-labs/"),
    FOOTER_COPY("© 2024 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy"),

    //CART AND CHECKOUT
    PAYMENT_INFORMATION("Payment Information"),
    PAYMENT_VALUE("SauceCard #31337"),
    SHIPPING_INFORMATION("Shipping Information"),
    SHIPPING_VALUE("Free Pony Express Delivery!"),
    PRICE_TOTAL("Price Total"),
    ITEM_TOTAL("Item total: $129.94"),
    TAX("Tax: $10.40"),
    TOTAL("Total: $140.34"),

    //SUBMITTED PAGE
    SUBMITTED_TITLE("Checkout: Complete!"),
    THANK_YOU("Thank you for your order!"),
    ORDER_TEXT("Your order has been dispatched, and will arrive just as fast as the pony can get there!");


    private String name;

    SwagLabsEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static SwagLabsEnum[] HamburgerMenu() {
        return new SwagLabsEnum[]{ALL_ITEMS_BUTTON, ABOUT_BUTTON, LOGOUT_BUTTON, RESET_BUTTON};
    }

    public static SwagLabsEnum[] Backpack() {
        return new SwagLabsEnum[]{BACKPACK_TITLE, BACKPACK_DESCRIPTION, BACKPACK_PRICE, BACKPACK_BUTTON};
    }

    public static SwagLabsEnum[] BikeLight() {
        return new SwagLabsEnum[]{BIKE_TITLE, BIKE_DESCRIPTION, BIKE_PRICE, BIKE_BUTTON};
    }

    public static SwagLabsEnum[] Shirt() {
        return new SwagLabsEnum[]{SHIRT_TITLE, SHIRT_DESCRIPTION, SHIRT_PRICE, SHIRT_BUTTON};
    }

    public static SwagLabsEnum[] Fleece() {
        return new SwagLabsEnum[]{FLEECE_TITLE, FLEECE_DESCRIPTION, FLEECE_PRICE, FLEECE_BUTTON};
    }

    public static SwagLabsEnum[] Onesie() {
        return new SwagLabsEnum[]{ONESIE_TITLE, ONESIE_DESCRIPTION, ONESIE_PRICE, ONESIE_BUTTON};
    }

    public static SwagLabsEnum[] Sweater() {
        return new SwagLabsEnum[]{SWEATER_TITLE, SWEATER_DESCRIPTION, SWEATER_PRICE, SWEATER_BUTTON};
    }

}
