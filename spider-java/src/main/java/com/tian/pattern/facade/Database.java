package com.tian.pattern.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by xiaoxi on 2017/6/3.
 */
public class Database {
    private Database(){}

    public static Properties getProperties(String dbname){
        String fileName = dbname + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
