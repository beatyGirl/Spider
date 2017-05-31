package com.tian.pattern.strategy;

/**
 * Created by xiaoxi on 2017/5/31.
 */
public interface Strategy {

    public Hand nextHand();
    public void study(boolean win);
}
