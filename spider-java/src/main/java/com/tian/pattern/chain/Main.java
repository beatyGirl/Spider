package com.tian.pattern.chain;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public class Main {

    public static void main(String args[]){
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob",100);
        Support charfile = new SpecialSupport("Charlie",429);
        Support diana = new LimitSupport("Diana",200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred",300);

        alice.setNext(bob).setNext(charfile).setNext(diana).setNext(elmo).setNext(fred);
        for (int i=0;i<500;i+=33){
            alice.support(new Trouble(i));
        }
    }
}
