package com.tian.pattern.bridge;

/**
 * Created by xiaoxi on 2017/5/31.
 */
public class Main {

    public static void main(String args[]){

        Display display = new Display(new StringDisplayImpl("Hello world!"));
        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("Hello Count!"));

        display.display();

        countDisplay.multiDisplay(5);
    }
}
