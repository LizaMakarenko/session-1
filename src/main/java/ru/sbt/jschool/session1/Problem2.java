package ru.sbt.jschool.session1;


import java.util.Properties;

public class Problem2 {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        for (String key : properties.stringPropertyNames()) {
            String value = properties.getProperty(key);
            System.out.println(key + ": " + value);
        }
    }
}

