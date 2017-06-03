package com.tian.pattern.observer;

/**
 * Created by xiaoxi on 2017/6/3.
 */
public class Main {
    public static void main(String args[]){
        //NumberGenerator numberGenerator = new RandomNumberGenerator();
        NumberGenerator numberGenerator = new IncrementNumberGenerator(10,50,5);
        Observer observer1 = new GraphObserver();
        Observer observer2 = new DigitObserver();

        numberGenerator.addObserver(observer2);
        numberGenerator.addObserver(observer1);

        numberGenerator.execute();


    }
}
