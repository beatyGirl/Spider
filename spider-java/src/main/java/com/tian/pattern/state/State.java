package com.tian.pattern.state;

/**
 * Created by xiaoxi on 2017/6/5.
 */
public interface State {

    public void doClock(Context context,int hour);//设置时间
    public void doUser(Context context);//使用金库
    public void doAlarm(Context context);//按下警铃
    public void doPhone(Context context);//正常通话
}
