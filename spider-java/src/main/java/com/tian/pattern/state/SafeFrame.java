package com.tian.pattern.state;

import com.tian.pattern.decorator.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by xiaoxi on 2017/6/5.
 */
public class SafeFrame extends Frame implements Context,ActionListener {

    private TextField textClock = new TextField(60);//显示当前时间
    private TextArea textScreen = new TextArea(10,600);//显示警报中心的记录
    private Button buttonUser = new Button("使用金库");
    private Button buttonAlarm = new Button("按下警报");
    private Button buttonPhone = new Button("正常通话");
    private Button buttonEnd = new Button("结束");

    private State state = DayState.getInstance();//当前状态

    public SafeFrame(String title){
        super(title);
        setBackground(Color.LIGHT_GRAY);//设置背景色
        setLayout(new BorderLayout());
        //设置textClock
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        //设置textScreen
        add(textScreen,BorderLayout.CENTER);
        textScreen.setEditable(false);
        //为界面添加按钮
        Panel panel = new Panel();
        panel.add(buttonUser);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonEnd);
        //配置界面
        add(panel,BorderLayout.SOUTH);
        //显示
        pack();
        show();
        //设置监视器
        buttonUser.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonEnd.addActionListener(this);
    }

    //按钮按下后，方法被调用
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUser){
            state.doUser(this);
        }else if (e.getSource() == buttonAlarm){
            state.doAlarm(this);
        }else if (e.getSource() == buttonPhone){
            state.doPhone(this);
        }else if (e.getSource() == buttonEnd){
            System.exit(0);
        }else {
            System.out.println("？");
        }
    }

    @Override
    public void setClock(int hour) {
        String clockstring = "现在时间是：";
        if (hour < 10){
            clockstring += "0" + hour + ":00";
        }else{
            clockstring += hour + ":00";
        }
        System.out.println(clockstring);
        textClock.setText(clockstring);
        state.doClock(this,hour);
    }

    //改变状态
    @Override
    public void changeState(State state) {
        System.out.println("从" + this.state + "状态变为了" + state + "状态。");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call! " + msg + "\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("recoding..." + msg + "\n");
    }
}
