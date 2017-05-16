package com.spider.bean;

import java.util.LinkedList;

/**
 * Created by xiaoxi on 2017/3/30.
 * 自定义队列表，用于保存DOTO表
 */
public class Queue {
    /**
     * 定义一个队列，使用LinkedList实现
     */
    private LinkedList<Object> linkedList = new LinkedList<Object>();//入队列
    /**
     * 将t加入到队列中
     */
    public void enQueue(Object o){
        linkedList.add(o);
    }

    /**
     * 移除队列的第一项并返回
     */
    public Object deQueue(){
        return linkedList.removeFirst();
    }

    /**
     * 返回队列是否为空
     */
    public boolean isQueueEmpty(){
        return linkedList.isEmpty();
    }

    /**
     * 判断并返回队列是否包含T
     */
    public boolean contains(Object o){
        return linkedList.contains(o);
    }

    /**
     * 判断队列是否为空
     */
    public boolean empty(){
        return linkedList.isEmpty();
    }
}
