package com.tian.pattern.visitor;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public abstract class Visitor {

    public abstract void visit(File file);
    public abstract void visit(Director director);
}
