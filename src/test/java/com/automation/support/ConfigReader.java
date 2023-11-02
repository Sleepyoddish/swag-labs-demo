package com.automation.support;

import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {

    static Properties properties = new Properties();

    public static void initProperty() {
        try {
            FileReader fileReader = new FileReader("src/test/resources/config.properties");
            properties.load(fileReader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
