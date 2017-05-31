package com.tian.pattern.strategy;

/**
 * Created by xiaoxi on 2017/5/31.
 */
public class Hand {

    public static final int HANDVALUE_GUU = 0; //石头
    public static final int HANDVALUE_CHO = 1; //剪刀
    public static final int HANDVALUE_PAA = 2; //布


    public static final Hand[] hand = { //表示猜拳的3种实例对象
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };

    private static final String[] name = { //手势的字符串
            "石头","剪刀","布"
    };

    private int handvalue;
    public Hand(int handvalue){
        this.handvalue = handvalue;
    }

    public static Hand getHand(int handvalue){
        return hand[handvalue];
    }

    /**
     * 如果this赢了h则返回了true
     * @param h
     * @return
     */
    public boolean isStrongThan(Hand h){
        return fight(h) == 1;
    }

    /**
     *如果this输给了h则返回了true
     * @param h
     * @return
     */
    public boolean isWeakerThan(Hand h){
        return fight(h) == -1;
    }


    private int fight(Hand h){
        if (this == h){
            return 0;
        }else if ((this.handvalue + 1) % 3 == h.handvalue){
            return 1;
        }else {
            return 2;
        }
    }

    public String toString(){
        return name[handvalue];
    }

}
