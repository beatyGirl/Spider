package com.tian.pattern.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by xiaoxi on 2017/6/3.
 */
 public abstract class NumberGenerator {

    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        Iterator obi = observers.iterator();
        while (obi.hasNext()){
            Observer observer = (Observer)obi.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
