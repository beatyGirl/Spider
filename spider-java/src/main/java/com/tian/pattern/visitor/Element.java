package com.tian.pattern.visitor;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public interface Element {

    public void accept(Visitor visitor);
}
