package com.tian.pattern.chain;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public class Trouble {
    private int number;//问题编号

    public Trouble(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public String toString(){
        return "[Trouble " + number + " ]";
    }
}
