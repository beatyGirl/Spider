package com.tian.pattern.state;

/**
 * Created by xiaoxi on 2017/6/5.
 */
public class DayState implements State {

    private static DayState singleton = new DayState();
    private DayState(){}

    //设置单例
    public static DayState getInstance(){
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || hour >= 17){
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUser(Context context) {
        context.recordLog("使用金库（白天）");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃（白天）");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("正常通话（白天）");
    }

    public String toString(){
        return "[ 白天 ]";
    }
}
