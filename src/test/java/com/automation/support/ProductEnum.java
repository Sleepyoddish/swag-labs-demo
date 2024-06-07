package com.automation.support;

public enum ProductEnum {

    //BACKPACK
    BACKPACK("https://www.saucedemo.com/inventory-item.html?id=4", "Sauce Labs Backpack",
            "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.", "$29.99", "Add to cart"),

    //BIKE LIGHT
    BIKE("https://www.saucedemo.com/inventory-item.html?id=0", "Sauce Labs Bike Light", "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.", "$9.99", "Add to cart"),


    //SHIRT
    SHIRT("https://www.saucedemo.com/inventory-item.html?id=1", "Sauce Labs Bolt T-Shirt", "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.", "$15.99", "Add to cart"),


    //FLEECE
    FLEECE("https://www.saucedemo.com/inventory-item.html?id=5", "Sauce Labs Fleece Jacket", "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.", "$49.99", "Add to cart"),


    //ONESIE
    ONESIE("https://www.saucedemo.com/inventory-item.html?id=2", "Sauce Labs Onesie", "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel."
            , "$7.99", "Add to cart"),


    //SWEATER
    SWEATER("https://www.saucedemo.com/inventory-item.html?id=3", "Test.allTheThings() T-Shirt (Red)", "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.", "$15.99", "Add to cart");


    private String url;
    private String title;
    private String description;
    private String price;
    private String button;

    ProductEnum(String url, String title, String description, String price, String button) {
        this.url = url;
        this.title = title;
        this.description = description;
        this.price = price;
        this.button = button;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getButton() {
        return button;
    }


}
