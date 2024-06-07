package com.automation.support;

public enum LoginEnum {

    //LOGIN
    SWAGLABS_URL("https://www.saucedemo.com/"),
    LOGIN_HEADER("Swag Labs");

    private String name;

    LoginEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
