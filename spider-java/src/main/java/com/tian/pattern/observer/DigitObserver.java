package com.tian.pattern.observer;

/**
 * Created by xiaoxi on 2017/6/3.
 */
public class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println("DigitObserver : " + numberGenerator.getNumber());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
