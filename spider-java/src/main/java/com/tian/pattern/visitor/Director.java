package com.tian.pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public class Director extends Entry{

    private String name;

    private ArrayList list = new ArrayList();

    public Director(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry)iterator.next();
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry){
        list.add(entry);
        return this;
    }

    public Iterator iterator(){
        return list.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
