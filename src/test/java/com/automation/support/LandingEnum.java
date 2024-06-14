package com.automation.support;

public enum LandingEnum {

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

    //FOOTER
    TWITTER_URL("https://x.com/saucelabs"),
    FACEBOOK_URL("https://www.facebook.com/saucelabs"),
    LINKEDIN_URL("https://www.linkedin.com/company/sauce-labs/"),
    FOOTER_COPY("© 2024 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy");

    private String name;

    public String getName() {
        return name;
    }

    LandingEnum(String name) {
        this.name = name;

    }

}
