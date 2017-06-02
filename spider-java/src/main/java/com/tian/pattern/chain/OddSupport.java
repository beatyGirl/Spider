package com.tian.pattern.chain;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public class OddSupport  extends Support{

    public OddSupport(String name){
        super(name);
    }

    protected boolean resolve(Trouble trouble){
        if (trouble.getNumber() % 2 == 1){
            return true;
        }else {
            return false;
        }
    }
}
