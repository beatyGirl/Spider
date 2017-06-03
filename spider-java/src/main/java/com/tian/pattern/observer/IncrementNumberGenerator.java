package com.tian.pattern.observer;

import java.util.Iterator;

/**
 * Created by xiaoxi on 2017/6/3.
 */
public class IncrementNumberGenerator extends NumberGenerator {



    private int start;
    private int end;
    private int count;

    public IncrementNumberGenerator(int start,int end,int count){
        this.start = start;
        this.end = end;
        this.count = count;
    }

    @Override
    public int getNumber() {
        return start;
    }

    @Override
    public void execute() {

        do {
            notifyObservers();
            start += count;
        }while (start < end);
    }
}
