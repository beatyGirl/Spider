package com.tian.pattern.chain;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public class SpecialSupport extends Support {

    private int number;

    public SpecialSupport(String name,int number){
        super(name);
        this.number = number;
    }

    protected boolean resolve(Trouble trouble){
        if (trouble.getNumber() == number){
            return true;
        }else {
            return false;
        }
    }
}
