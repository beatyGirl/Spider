package com.tian.pattern.state;

/**
 * Created by xiaoxi on 2017/6/5.
 */
public interface Context {

    public void setClock(int hour);//设置时间
    public void changeState(State state);//设置状态
    public void callSecurityCenter(String msg);//联系警报中心
    public void recordLog(String msg);//在警报中心留下记录
}
