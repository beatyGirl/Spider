package com.tian.pattern.decorator;

/**
 * Created by xiaoxi on 2017/6/2.
 */
public class Main {

    public static void main(String args[]){
        Display d1 = new StringDisplay("Hello,World");
        Display d2 = new SideBorder(d1,'#');
        Display d3 = new FullBorder(d2);

        d1.show();
        d2.show();
        d3.show();

        Display d4 = new SideBorder(new FullBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("你好，世界！")),'*'))),'/');
        d4.show();

        Display d5 = new UpDownBorder(d1,'-');
        d5.show();

        Display d6 = new FullBorder(
                new UpDownBorder(
                      new SideBorder(
                              new UpDownBorder(
                                      new SideBorder(
                                              new StringDisplay("你好，世界"),'*'
                                      ),'='
                              ),'|'
                      ),'/'
                )
        );
        d6.show();



        MultiStringDisplay md = new MultiStringDisplay();
        md.add("早上好。");
        md.add("下午好。");
        md.add("晚安，再见！");
        md.show();

        Display d7 = new SideBorder(md,'#');
        d7.show();
        Display d8 = new FullBorder(md);
        d8.show();

    }
}
