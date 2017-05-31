package com.tian.pattern.strategy;

import java.util.Random;

/**
 * Created by xiaoxi on 2017/5/31.
 */
public class WinningStrategy implements Strategy {

    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed){
        random = new Random(seed);
    }
    @Override
    public Hand nextHand() {
        if (!won){
            prevHand = Hand.getHand(random.nextInt());
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
