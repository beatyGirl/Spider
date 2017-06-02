package com.tian.pattern.chain;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public class NoSupport extends Support {

    public NoSupport(String name){
        super(name);
    }

    protected boolean resolve(Trouble trouble){
        return false;
    }
}
