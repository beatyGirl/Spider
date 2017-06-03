package com.tian.pattern.facade;

import javax.xml.crypto.Data;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by xiaoxi on 2017/6/3.
 */
public class PageMaker {

    private PageMaker(){}

    public static void makeWelcomePage(String mailaddr,String filename){
        try {
            Properties properties = Database.getProperties("F:\\Spider\\spider-java\\src\\main\\java\\com\\tian\\pattern\\facade\\maildata");
            String username = properties.getProperty(mailaddr);

            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s Page");
            writer.paragraph("等着你的邮件哦！");
            writer.paragraph(username + "欢迎来到" + username + "主页");

            writer.mailto(mailaddr,username);
            writer.close();

            System.out.println(filename + " is created for " + mailaddr + " (" + username + ") ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
