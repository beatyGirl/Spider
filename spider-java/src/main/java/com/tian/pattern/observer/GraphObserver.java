package com.tian.pattern.observer;

import com.sun.xml.internal.stream.util.ThreadLocalBufferAllocator;

/**
 * Created by xiaoxi on 2017/6/3.
 */
public class GraphObserver implements Observer {

    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.print("GraphObserver : ");

        int count = numberGenerator.getNumber();
        for (int i=0;i<count;i++){
            System.out.print("*");
        }
        System.out.println();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
