package com.tian.pattern.decorator;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public abstract class Border extends Display {

    protected Display display;//表示被装饰物

    protected Border(Display display){
        this.display = display;
    }
}
