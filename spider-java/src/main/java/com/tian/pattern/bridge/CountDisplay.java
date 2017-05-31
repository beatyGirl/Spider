package com.tian.pattern.bridge;

/**
 * Created by xiaoxi on 2017/5/31.
 */
public class CountDisplay extends Display{

    public CountDisplay(DisplayImpl display){
        super(display);
    }

    public void multiDisplay(int num){
        open();

        for (int i=0;i<num;i++){
            print();
        }

        close();
    }
}
