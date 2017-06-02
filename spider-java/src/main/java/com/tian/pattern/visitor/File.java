package com.tian.pattern.visitor;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public class File extends Entry {

    private String name;
    private int size;

    public File(String name,int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
